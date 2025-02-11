package com.artesanias.ventas.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "orden_producto")
public class OrdenProducto {
    @EmbeddedId
    private OrdenProductoId id;

    @MapsId("idProductopk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "id_productopk", nullable = false)
    private ProductoEntity idProductopk;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private Orden orden;

    @NotNull
    @Column(name = "cantidad_producto", nullable = false)
    private Integer cantidadProducto;

}