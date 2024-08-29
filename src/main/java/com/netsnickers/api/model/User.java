package com.netsnickers.api.model;

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
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "nome", nullable = false, length = 100)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(name = "telefone")
    private Long phone;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "endereco", nullable = false, unique = true, length = 255)
    private String address;

    @Column(name = "cep", nullable = false, length = 10)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "perfil_id", referencedColumnName = "idProfile")
    private Profile profile;

}
