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
@Table(name = "produto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String name;

    @Column(name = "descricao", length = 200)
    private String description;

    @Column(name = "preco", nullable = false)
    private Float price;

    @Column(name = "tamanho", nullable = false)
    private Integer size;

    @Column(name = "quantidade", nullable = false)
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "cor_id", referencedColumnName = "id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    private Brand brand;

}
