package com.example.petClinicJSF.controller;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Pet;
import com.example.petClinicJSF.model.entity.PetType;
import com.example.petClinicJSF.service.OwnerService;
import com.example.petClinicJSF.service.PetService;
import com.example.petClinicJSF.service.PetTypeService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.LinkedHashSet;
import java.util.List;

@Controller
@Scope(value = "view")
@Getter
@Setter
public class PetController {

    @Autowired
    private PetService petService;

    @Autowired
    private PetTypeService petTypeService;

    @Autowired
    private OwnerService ownerService;

    private Pet pet;

    private Owner selectedOwner;

    private List<Owner> selectedOwners;
    private List<Pet> petList;

    private Pet selectedPet;


    private List<PetType> petTypeList;
    private List<Owner> ownerList;

    @PostConstruct
    public void init(){
        this.pet = new Pet();
        this.petList = petService.findAll();
        this.petTypeList = petTypeService.findAll();
        this.ownerList = ownerService.findAll();
    }

    public void save(){
        this.petService.save(this.pet);
        infoMessage("Kaydedildi", "Kaydedilen hayvan: ", this.pet);
        this.petList.add(pet);
        this.pet = new Pet();

    }

    public void delete(Pet pet){
        this.petService.delete(pet);
        infoMessage("Silindi", "Silinen Hayvan  : " ,pet);
        this.petList.remove(pet);
    }

    public void update(){
        this.petService.update(this.selectedPet);
        infoMessage("Güncellendi.",
                "Güncellenen Hayvan  : ",this.selectedPet);
        this.selectedPet = new Pet();
    }
    public void infoMessage(String summary, String detail, Pet pet) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,
                new FacesMessage(summary,
                        detail + pet.getName()));
    }

    public void selectPet(Pet pet){
        this.selectedPet = pet;
    }

    public void changeOwner(){
        this.petList = this.petService.findPetByOwner(this.selectedOwner);
    }

    public void changePet() {
        this.selectedOwners =
                (List<Owner>) this.selectedPet.getOwner();


    }
}
