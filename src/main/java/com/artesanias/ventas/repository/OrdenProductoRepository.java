package com.artesanias.ventas.repository;

import com.artesanias.ventas.entity.OrdenProducto;
import com.artesanias.ventas.entity.OrdenProductoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenProductoRepository extends JpaRepository<OrdenProducto, OrdenProductoId> {
}