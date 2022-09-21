package com.example.petClinicJSF.repository;
import com.example.petClinicJSF.model.entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findOwnerByLastName(String lastName);


}
