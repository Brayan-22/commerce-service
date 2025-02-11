package com.artesanias.ventas.repository;

import com.artesanias.ventas.entity.Orden;
import com.artesanias.ventas.entity.OrdenId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, OrdenId> {
}