package com.joaquin.api.RestFulApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Social {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String imgSocial;
    private String nameSocial;
    private String linkSocial;

    public Social() {
    }

    public Social(Long id, String imgSocial, String nameSocial, String linkSocial) {
        this.id = id;
        this.imgSocial = imgSocial;
        this.nameSocial = nameSocial;
        this.linkSocial = linkSocial;
    }
}
