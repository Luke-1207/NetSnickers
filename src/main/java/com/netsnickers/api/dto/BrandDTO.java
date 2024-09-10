package com.netsnickers.api.dto;

import com.netsnickers.api.enums.EnumBrand;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BrandDTO {

    private Long idBrand;
    private EnumBrand name;

}
