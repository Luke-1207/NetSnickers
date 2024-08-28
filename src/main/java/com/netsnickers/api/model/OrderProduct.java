package com.netsnickers.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedido_produto")
public class OrderProduct {

    @EmbeddedId
    private OrderProductId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "pedido_id")
    private Order order;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "produto_id")
    private Product product;

}
