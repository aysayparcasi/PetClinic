package com.example.petClinicJSF.repository;

import com.example.petClinicJSF.model.entity.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType,Long> {

    PetType findPetTypeByName(String name);
}
