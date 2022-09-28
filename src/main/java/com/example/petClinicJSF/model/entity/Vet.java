package com.example.petClinicJSF.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "vets")
@Getter
@Setter
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id") )
    private Set<Specialty> specialties;
    //Set yapmamın sebebi aynı özellikten birden fazla olmasına izin vermemek.
    //Ve birden fazla null eleman kabul etmemek
}
