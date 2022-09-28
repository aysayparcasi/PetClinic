package com.example.petClinicJSF.controller;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.PetType;
import com.example.petClinicJSF.model.entity.Specialty;
import com.example.petClinicJSF.service.SpecialtyService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;

@Controller
@Scope(value = "view")
@Getter
@Setter
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    private Specialty specialty;

    private Specialty selectedSpecialty;

    private List<Specialty> specialtyList;

    @PostConstruct
    public void init(){
        this.specialty = new Specialty();
        this.specialtyList = specialtyService.findAll();
    }

    public void save(){
        this.specialtyService.save(this.specialty);
        infoMessage("Kaydedildi. ", "Kaydedilen Özellik : ", this.specialty);
        this.specialtyList.add(specialty);
        this.specialty = new Specialty();
    }


    public void  delete(Specialty specialty){
        this.specialtyService.delete(this.specialty);
        infoMessage("Silindi ", "Silinen Özellik : ",specialty);
        this.specialtyList.remove(specialty);
    }

    public void update(){
        this.specialtyService.update(this.selectedSpecialty);
        infoMessage("Güncellendi. ", "Güncellenen Özellik : ", this.selectedSpecialty);
        this.selectedSpecialty = new Specialty();
    }

    public void selectSpecialty(Specialty specialty){
        this.selectedSpecialty = specialty;
    }
    public void infoMessage(String summary, String detail, Specialty specialty) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,
                new FacesMessage(summary,
                        detail + specialty.getName()));
    }
}
