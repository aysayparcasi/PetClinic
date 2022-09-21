package com.example.petClinicJSF.serviceImp;

import com.example.petClinicJSF.model.entity.PetType;
import com.example.petClinicJSF.repository.PetTypeRepository;
import com.example.petClinicJSF.service.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PetTypeServiceImp implements PetTypeService {

    @Autowired
    private PetTypeRepository petTypeRepository;

    @Transactional
    @Override
    public List<PetType> findAll() {
        return (List<PetType>) this.petTypeRepository.findAll();
    }

    @Transactional
    @Override
    public void save(PetType petType) {
        this.petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        this.petTypeRepository.delete(petType);
    }

    @Override
    public void update(PetType petType) {
        this.petTypeRepository.save(petType);
    }

    @Override
    public PetType findByName(String name) {
        return this.petTypeRepository.findPetTypeByName(name);
    }
}
