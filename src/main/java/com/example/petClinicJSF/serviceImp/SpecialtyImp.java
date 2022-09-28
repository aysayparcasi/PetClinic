package com.example.petClinicJSF.serviceImp;

import com.example.petClinicJSF.model.entity.Specialty;
import com.example.petClinicJSF.repository.SpecialtyRepository;
import com.example.petClinicJSF.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SpecialtyImp implements SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Transactional
    @Override
    public void save(Specialty specialty) {
        this.specialtyRepository.save(specialty);

    }

    @Transactional
    @Override
    public void delete(Specialty specialty) {
        this.specialtyRepository.delete(specialty);
    }

    @Transactional
    @Override
    public void update(Specialty specialty) {
        this.specialtyRepository.save(specialty);
    }

    @Transactional
    @Override
    public List<Specialty> findAll() {
        return (List<Specialty>) this.specialtyRepository.findAll();
    }

    @Transactional
    @Override
    public Specialty findById(Long id) {
        return this.specialtyRepository.findById(id).orElse(null);

    }
}
