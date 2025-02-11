package com.artesanias.ventas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Size(max = 36)
    @Column(name = "id_usuario", nullable = false, length = 36)
    private String idUsuario;

    @Size(max = 32)
    @NotNull
    @Column(name = "username", nullable = false, length = 32)
    private String username;

    @Size(max = 60)
    @NotNull
    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @Size(max = 32)
    @NotNull
    @Column(name = "role", nullable = false, length = 32)
    private String role;

    @Size(max = 32)
    @NotNull
    @Column(name = "mail", nullable = false, length = 32)
    private String mail;

}