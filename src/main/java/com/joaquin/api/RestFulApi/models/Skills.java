package com.joaquin.api.RestFulApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String imgSkill;
    private String nameSkill;
    private int progress;

    public Skills() {
    }

    public Skills(Long id, String imgSkill, String nameSkill, int progress) {
        this.id = id;
        this.imgSkill = imgSkill;
        this.nameSkill = nameSkill;
        this.progress = progress;
    }
}
