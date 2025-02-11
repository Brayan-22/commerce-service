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
public class PagoId implements Serializable {
    private static final long serialVersionUID = -8051488772054671047L;
    @Size(max = 36)
    @NotNull
    @Column(name = "id_clientepk", nullable = false, length = 36)
    private String idClientepk;

    @Size(max = 36)
    @NotNull
    @Column(name = "id_ordenpk", nullable = false, length = 36)
    private String idOrdenpk;

    @Size(max = 36)
    @NotNull
    @Column(name = "id_pago", nullable = false, length = 36)
    private String idPago;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PagoId entity = (PagoId) o;
        return Objects.equals(this.idOrdenpk, entity.idOrdenpk) &&
                Objects.equals(this.idPago, entity.idPago) &&
                Objects.equals(this.idClientepk, entity.idClientepk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdenpk, idPago, idClientepk);
    }

}