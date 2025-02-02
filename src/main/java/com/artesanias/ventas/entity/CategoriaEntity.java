package com.artesanias.ventas.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "\"Categoria\"")
@Table(name = "\"categoria\"")
public class CategoriaEntity {
    @Id
    @Column(name = "\"id_categoriapk\"")
    private Integer id;
    @Column(name = "\"nombre_categoria\"")
    private String nombre;
    @Column(name = "\"descripcion_categoria\"")
    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    private Set<ProductoEntity> productos = new HashSet<>();

}
