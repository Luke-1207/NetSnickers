package com.netsnickers.api.dto;

import com.netsnickers.api.enums.EnumPerfil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO {

    private Long idProfile;
    private EnumPerfil name;

}
