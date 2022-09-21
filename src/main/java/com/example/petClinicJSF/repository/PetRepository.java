package com.example.petClinicJSF.repository;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Pet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends CrudRepository<Pet,Long> {

    @Query(value = "select i from Pet i where i.owner=:owner")
    List<Pet> PetByOwner(Owner owner);

    Pet findPetByName(String name);
}
