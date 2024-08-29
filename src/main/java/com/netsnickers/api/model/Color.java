package com.netsnickers.api.model;

import com.netsnickers.api.enums.EnumCategory;
import com.netsnickers.api.enums.EnumColor;
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
@Table(name = "cor")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColor;

    @Enumerated(EnumType.STRING)
    @Column(name = "nome", nullable = false)
    private EnumColor name;

}