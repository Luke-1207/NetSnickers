package com.netsnickers.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long idProduct;
    private String name;
    private String description;
    private Float price;
    private Integer size;
    private Long quantity;
    private CategoryDTO category;
    private ColorDTO color;
    private BrandDTO brand;
    private String urlPhoto;

}
