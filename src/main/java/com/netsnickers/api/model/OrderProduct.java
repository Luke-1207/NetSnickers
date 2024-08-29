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
    private OrderProductId idOrderProduct;

    @ManyToOne
    @MapsId("idOrder")
    @JoinColumn(name = "pedido_id")
    private Order order;

    @ManyToOne
    @MapsId("idProduct")
    @JoinColumn(name = "produto_id")
    private Product product;

}
