package com.example.petClinicJSF.repository;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Pet;
import com.example.petClinicJSF.model.entity.Specialty;
import com.example.petClinicJSF.model.entity.Vet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VetRepository extends CrudRepository<Vet,Long> {

    @Query(value = "select i from Vet i where i.specialties=:specialties")
    List<Vet> VetBySpecialty(Specialty specialty);


}
