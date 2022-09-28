package com.example.petClinicJSF.serviceImp;

import com.example.petClinicJSF.model.entity.Specialty;
import com.example.petClinicJSF.model.entity.Vet;
import com.example.petClinicJSF.repository.VetRepository;
import com.example.petClinicJSF.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VetServiceImp implements VetService {

    @Autowired
    private VetRepository vetRepository;

    @Transactional
    @Override
    public void save(Vet vet) {
        this.vetRepository.save(vet);
    }

    @Transactional
    @Override
    public void delete(Vet vet) {
        this.vetRepository.delete(vet);
    }

    @Transactional
    @Override
    public void update(Vet vet) {
        this.vetRepository.save(vet);
    }

    @Transactional
    @Override
    public List<Vet> findAll() {
        return (List<Vet>) this.vetRepository.findAll();
    }

    @Transactional
    @Override
    public Vet findById(Long id) {
        return this.vetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vet> findVetBySpecialty(Specialty specialty) {
        return this.vetRepository.VetBySpecialty(specialty);
    }
}
