package com.example.petClinicJSF.serviceImp;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Pet;
import com.example.petClinicJSF.repository.PetRepository;
import com.example.petClinicJSF.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PetServiceImp implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Transactional
    @Override
    public List<Pet> findAll() {
        return (List<Pet>) this.petRepository.findAll();
    }

    @Transactional
    @Override
    public void save(Pet pet) {
        this.petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        this.petRepository.delete(pet);
    }

    @Override
    public void update(Pet pet) {
        this.petRepository.save(pet);
    }

    @Override
    public Pet findByName(String name) {
        return this.petRepository.findPetByName(name);
    }

    @Override
    public List<Pet> findPetByOwner(Owner owner) {
        return this.petRepository.PetByOwner(owner);
    }
}
