package com.practica.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false, length = 60)
    private String marca;

    @Column(nullable = false, length = 60)
    private String hechoen;

    @Column(nullable = false)
    private float precio;
}
