package com.netsnickers.api.repository;

import com.netsnickers.api.model.OrderProduct;
import com.netsnickers.api.model.OrderProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductId> {

    List<OrderProduct> findByOrderIdOrder(Long orderId);
}
