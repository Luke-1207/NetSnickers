package com.netsnickers.api.dto;

import com.netsnickers.api.enums.EnumPaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethodDTO {

    private Long idPaymentMethod;
    private EnumPaymentMethod name;

}
