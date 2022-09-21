package com.example.petClinicJSF.service;

import com.example.petClinicJSF.model.entity.Owner;

import java.util.List;

public interface OwnerService {

    void save(Owner owner);

    void delete(Owner owner);

    void update(Owner owner);
    List<Owner> findAll();

    Owner findByName(String lastName);
}
