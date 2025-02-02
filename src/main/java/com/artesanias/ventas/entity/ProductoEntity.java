package com.artesanias.ventas.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "\"Producto\"")
@Table(name = "\"producto\"")
public class ProductoEntity {
    @Id
    @Column(name = "\"id_productopk\"")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "\"nombre_producto\"")
    private String nombre;
    @Column(name = "\"precio_producto\"")
    private Double precio;
    @Column(name = "\"desc_producto\"")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "\"id_categoriapk\"")
    private CategoriaEntity categoria;
}
