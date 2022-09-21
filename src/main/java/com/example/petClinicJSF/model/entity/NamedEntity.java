package com.example.petClinicJSF.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@ToString
@MappedSuperclass
public class NamedEntity extends BaseEntity {

    @Column(name = "name")
    private String name;
}