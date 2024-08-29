package com.netsnickers.api.model;

import com.netsnickers.api.enums.EnumCategory;
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
@Table(name = "categoria")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;

    @Enumerated(EnumType.STRING)
    @Column(name = "nome", nullable = false)
    private EnumCategory name;

}
