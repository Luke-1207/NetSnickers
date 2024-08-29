package com.netsnickers.api.model;

import com.netsnickers.api.enums.EnumPaymentMethod;
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
@Table(name = "forma_pagamento")
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaymentMethod;

    @Enumerated(EnumType.STRING)
    @Column(name = "nome", nullable = false)
    private EnumPaymentMethod name;

}
