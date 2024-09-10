package com.netsnickers.api.service;

import com.netsnickers.api.dto.ProductDTO;
import com.netsnickers.api.dto.ProductFilterDTO;
import com.netsnickers.api.dto.UserDTO;
import com.netsnickers.api.mapper.ProductMapper;
import com.netsnickers.api.mapper.UserMapper;
import com.netsnickers.api.model.Product;
import com.netsnickers.api.model.User;
import com.netsnickers.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Boolean create(ProductDTO productDTO){
        Product product = ProductMapper.convertToEntity(productDTO, Product.class);
        productRepository.save(product);

        return true;
    }

    public ProductDTO findById(Long idProduct) {
        Product product = productRepository.getReferenceById(idProduct);
        return ProductMapper.convertToDTO(product, ProductDTO.class);
    }

    public List<ProductDTO> findAll(){
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOs = new ArrayList<>();
        for(Product product : products){
            productDTOs.add(ProductMapper.convertToDTO(product, ProductDTO.class));
        }

        return productDTOs;
    }

    public List<ProductDTO> findAllByFilter(ProductFilterDTO productFilterDTO){
        List<Product> products = productRepository.findAllByFilter(productFilterDTO);
        List<ProductDTO> productDTOs = new ArrayList<>();
        for(Product product : products){
            productDTOs.add(ProductMapper.convertToDTO(product, ProductDTO.class));
        }

        return productDTOs;
    }

    public Boolean update(ProductDTO productDTO){
        Product existingProduct = productRepository.getReferenceById(productDTO.getIdProduct());

        if (existingProduct != null) {
            Product product = ProductMapper.convertToEntity(productDTO, Product.class);
            productRepository.save(product);
            return true;
        } else {
            return false;
        }
    }

    public Boolean delete(Long idProduct) {
        Product product = productRepository.getReferenceById(idProduct);
        productRepository.delete(product);
        return true;
    }

}
