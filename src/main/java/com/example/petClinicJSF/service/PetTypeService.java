package com.example.petClinicJSF.service;

import com.example.petClinicJSF.model.entity.PetType;

import java.util.List;

public interface PetTypeService {

    List<PetType> findAll();
    void save(PetType petType);
    void delete(PetType petType);
    void update(PetType petType);
    PetType findByName(String name);
}
