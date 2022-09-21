package com.example.petClinicJSF.controller;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Pet;
import com.example.petClinicJSF.model.entity.PetType;
import com.example.petClinicJSF.service.PetTypeService;
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
public class PetTypeController {

    private PetType petType;
    private PetType selectedPetType;
    private List<PetType> petTypeList;

    @Autowired
    private PetTypeService petTypeService;

    @PostConstruct
    public void init(){
        this.petType = new PetType();
        this.petTypeList = petTypeService.findAll();
    }
    public void save (){
        this.petTypeService.save(this.petType);
        infoMessage("Kaydedildi", "Kaydedilen Hayvan Türü: ", this.petType);
        this.petTypeList.add(petType);
        this.petType = new PetType();
    }

    public void delete(PetType petType){
        this.petTypeService.delete(petType);
        infoMessage("Silindi", "Silinen Hayvan Türü  : " ,petType);
        this.petTypeList.remove(petType);
    }

    public void update(){
        this.petTypeService.update(this.selectedPetType);
        infoMessage("Güncellendi.",
                "Güncellenen Hayvan Türü  : ",this.selectedPetType);
        this.selectedPetType = new PetType();
    }
    public void infoMessage(String summary, String detail, PetType petType) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,
                new FacesMessage(summary,
                        detail + petType.getName()));
    }

    public void selectPetType(PetType petType){
        this.selectedPetType = petType;
    }



}
