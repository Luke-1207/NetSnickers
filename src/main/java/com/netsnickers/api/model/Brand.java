package com.netsnickers.api.model;

import com.netsnickers.api.enums.EnumBrand;
import com.netsnickers.api.enums.EnumColor;
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
@Table(name = "marca")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBrand;

    @Enumerated(EnumType.STRING)
    @Column(name = "nome", nullable = false)
    private EnumBrand name;

}
