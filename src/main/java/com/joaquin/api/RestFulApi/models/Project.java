package com.joaquin.api.RestFulApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String imgProject;
    private String nameProject;
    private String descriptionProject;
    private String linkProject;

    public Project() {
    }

    public Project(long id, String imgProject, String nameProject, String descriptionProject, String linkProject) {
        this.id = id;
        this.imgProject = imgProject;
        this.nameProject = nameProject;
        this.descriptionProject = descriptionProject;
        this.linkProject = linkProject;
    }
}
