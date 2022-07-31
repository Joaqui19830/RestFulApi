package com.joaquin.api.RestFulApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String imgStudy;
    private String title;
    private String duration;
    private String descriptionEducation;

    public Educacion() {
    }

    public Educacion(Long id, String imgStudy, String title, String duration, String descriptionEducation) {
        this.id = id;
        this.imgStudy= imgStudy;
        this.title = title;
        this.duration = duration;
        this.descriptionEducation = descriptionEducation;
    }
}
