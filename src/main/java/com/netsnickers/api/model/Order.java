package com.netsnickers.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedido")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    @Column(name = "frete", nullable = false)
    private Float freight;

    @Column(name = "valor_total", nullable = false)
    private Float totalValue;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "forma_pagamento_id", referencedColumnName = "idPaymentMethod")
    private PaymentMethod paymentMethod;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts;

}
