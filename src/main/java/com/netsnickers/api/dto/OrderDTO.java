package com.netsnickers.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long idOrder;
    private Float freight;
    private Float totalValue;
    private UserDTO user;
    private PaymentMethodDTO paymentMethod;
    private List<ProductDTO> products;

}
