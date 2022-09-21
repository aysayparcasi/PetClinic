package com.example.petClinicJSF.service;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Pet;

import java.util.List;

public interface PetService {

    List<Pet> findAll();

    void save(Pet pet);
    void delete(Pet pet);
    void update(Pet pet);

    Pet findByName(String name);
    List<Pet> findPetByOwner(Owner owner);
}
