package com.netsnickers.api.model;

import com.netsnickers.api.enums.EnumPerfil;
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
@Table(name = "perfil")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfile;

    @Enumerated(EnumType.STRING)
    @Column(name = "nome", nullable = false)
    private EnumPerfil name;

}
