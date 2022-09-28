package com.example.petClinicJSF.service;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Pet;
import com.example.petClinicJSF.model.entity.Specialty;
import com.example.petClinicJSF.model.entity.Vet;

import java.util.List;

public interface VetService {

    void save(Vet vet);

    void delete(Vet vet);

    void update(Vet vet);

    List<Vet> findAll();

    Vet findById(Long id);

    List<Vet> findVetBySpecialty(Specialty specialty);
}
