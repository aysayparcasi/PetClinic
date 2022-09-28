package com.example.petClinicJSF.service;

import com.example.petClinicJSF.model.entity.Specialty;

import java.util.List;

public interface SpecialtyService {

    void save(Specialty specialty);

    void delete(Specialty specialty);

    void update(Specialty specialty);

    List<Specialty> findAll();

    Specialty findById(Long id);
}
