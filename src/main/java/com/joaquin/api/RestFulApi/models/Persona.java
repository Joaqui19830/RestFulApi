package com.joaquin.api.RestFulApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String foto_perfil;
    private int edad;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String email, String foto_perfil, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.foto_perfil = foto_perfil;
        this.edad = edad;
    }
}
