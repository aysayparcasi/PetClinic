package com.example.petClinicJSF.serviceImp;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.repository.OwnerRepository;
import com.example.petClinicJSF.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OwnerServiceImp implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Transactional
    @Override
    public void save(Owner owner) {
        this.ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        this.ownerRepository.delete(owner);
    }

    @Override
    public void update(Owner owner) {
        this.ownerRepository.save(owner);
    }

    @Transactional
    @Override
    public List<Owner> findAll() {
        return (List<Owner>) this.ownerRepository.findAll();
    }

    @Override
    public Owner findByName(String lastName) {
        return this.ownerRepository.findOwnerByLastName(lastName);
    }
}
