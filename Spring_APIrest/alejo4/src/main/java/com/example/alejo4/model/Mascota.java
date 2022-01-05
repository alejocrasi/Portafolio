package com.example.alejo4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")

    @Getter
    private Long id;

    @Getter
    @Setter
    private String nombre;


    @Getter
    @Setter
    private String id_tipo_mascota;

    @Getter
    @Setter
    private Integer id_propietario;


}
