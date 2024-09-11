package com.netsnickers.api.service;

import com.netsnickers.api.dto.OrderDTO;
import com.netsnickers.api.dto.PlaceOrderDTO;
import com.netsnickers.api.dto.ProductDTO;
import com.netsnickers.api.enums.ShippingPriceByState;
import com.netsnickers.api.mapper.OrderMapper;
import com.netsnickers.api.mapper.ProductMapper;
import com.netsnickers.api.model.*;
import com.netsnickers.api.repository.OrderProductRepository;
import com.netsnickers.api.repository.OrderRepository;
import com.netsnickers.api.repository.ProductRepository;
import com.netsnickers.api.repository.UserRepository;
import com.netsnickers.api.util.CepUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderProductRepository orderProductRepository;

    public OrderDTO placeOrder(PlaceOrderDTO placeOrderDTO) {
        User user = userRepository.getReferenceById(placeOrderDTO.getIdUser());
        Float totalValue = 0f;
        List<Product> products = new ArrayList<>();
        for(Long idProduct : placeOrderDTO.getIdProducts()){
            Product product = productRepository.getReferenceById(idProduct);
            products.add(product);
            totalValue += product.getPrice();
        }

        Order order = new Order();
        order.setUser(user);
        order.setTotalValue(totalValue);
        String state = CepUtils.getStateFromCep(user.getCep());
        float freight = ShippingPriceByState.getFreightByState(state);
        order.setFreight(freight);
        orderRepository.save(order);

        List<ProductDTO> productDTOs = new ArrayList<>();
        for (Product product : products) {
            OrderProduct orderProduct = new OrderProduct();
            OrderProductId orderProductId = new OrderProductId(order.getIdOrder(), product.getIdProduct());

            orderProduct.setIdOrderProduct(orderProductId);
            orderProduct.setOrder(order);
            orderProduct.setProduct(product);

            orderProductRepository.save(orderProduct);
            productDTOs.add(ProductMapper.convertToDTO(product, ProductDTO.class));
        }

        OrderDTO orderDTO = OrderMapper.convertToDTO(order, OrderDTO.class);
        orderDTO.setProducts(productDTOs);

        return orderDTO;
    }

    public OrderDTO findById(Long idOrder) {
        Order order = orderRepository.getReferenceById(idOrder);
        List<OrderProduct> orderProducts = orderProductRepository.findByOrderIdOrder(idOrder);
        OrderDTO orderDTO = OrderMapper.convertToDTO(order, OrderDTO.class);

        List<ProductDTO> productDTOS = new ArrayList<>();
        for(OrderProduct orderProduct : orderProducts){
            productDTOS.add(ProductMapper.convertToDTO(orderProduct.getProduct(), ProductDTO.class));
        }
        orderDTO.setProducts(productDTOS);

        return orderDTO;
    }
}
