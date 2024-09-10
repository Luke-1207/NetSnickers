package com.netsnickers.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductFilterDTO {
    private String name;
    private String description;
    private Float minPrice;
    private Float maxPrice;
    private Integer size;
    private Long quantity;
    private String categoryName;
    private String colorName;
    private String brandName;
}
