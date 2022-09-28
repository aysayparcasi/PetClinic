package com.example.petClinicJSF.repository;

import com.example.petClinicJSF.model.entity.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
