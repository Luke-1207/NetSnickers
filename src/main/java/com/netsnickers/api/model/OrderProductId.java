package com.netsnickers.api.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class OrderProductId implements Serializable {
    private Long idOrder;
    private Long idProduct;
}
