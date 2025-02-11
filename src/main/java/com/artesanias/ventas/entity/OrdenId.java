package com.artesanias.ventas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class OrdenId implements Serializable {
    private static final long serialVersionUID = -8867269608872585479L;
    @Size(max = 36)
    @NotNull
    @Column(name = "id_clientepk", nullable = false, length = 36)
    private String idClientepk;

    @Size(max = 36)
    @NotNull
    @Column(name = "id_ordenpk", nullable = false, length = 36)
    private String idOrdenpk;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrdenId entity = (OrdenId) o;
        return Objects.equals(this.idOrdenpk, entity.idOrdenpk) &&
                Objects.equals(this.idClientepk, entity.idClientepk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdenpk, idClientepk);
    }

}