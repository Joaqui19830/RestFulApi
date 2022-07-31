package com.joaquin.api.RestFulApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String imgEstablecimiento;

    private String nombrePosition;
    private String descriptionPosition;

    public Experiencia() {
    }

    public Experiencia(long id, String imgEstablecimiento, String nombrePosition, String descriptionPosition) {
        this.id = id;
        this.imgEstablecimiento = imgEstablecimiento;
        this.nombrePosition = nombrePosition;
        this.descriptionPosition = descriptionPosition;
    }
}
