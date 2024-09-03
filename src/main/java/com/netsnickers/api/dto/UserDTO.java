package com.netsnickers.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long idUser;
    private String name;
    private String cpf;
    private Long phone;
    private String email;
    private String address;
    private String cep;
    private Long idProfile;

}
