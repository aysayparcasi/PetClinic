package com.example.petClinicJSF.controller;


import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.Specialty;
import com.example.petClinicJSF.model.entity.Vet;
import com.example.petClinicJSF.service.VetService;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;

@Controller
@Getter
@Setter
@Scope(value = "view")
public class VetController {

    @Autowired
    private VetService vetService;

    private Vet vet;

    private Vet selectedVet;

    private List<Vet> vetList;

    private Specialty selectedSpecialty;

    @PostConstruct
    public void init(){
        this.vet = new Vet();
        this.vetList = vetService.findAll();
    }

    public void  save(){
        this.vetService.save(this.vet);
        infoMessage("Kaydedildi",
                "Kaydedilen Veteriner : ",this.vet);
        this.vetList.add(vet);
        this.vet = new Vet();
    }

    public void delete(Vet vet){
        this.vetService.delete(vet);
        infoMessage("Silindi","Silinen Veteriner : ", vet);
        this.vetList.remove(vet);
    }

    public void update(){
        this.vetService.update(this.selectedVet);
        infoMessage("Güncellendi. ", "Güncellenen Veteriner : ", this.selectedVet );
        this.selectedVet = new Vet();
    }

    public void infoMessage(String summary, String detail, Vet vet) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,
                new FacesMessage(summary,
                        detail + vet.getFirstName() + vet.getLastName()));
    }

    public void selectVet(Vet vet){
        this.selectedVet = vet;
    }

    public void changeVet(){
        this.vetList = this.vetService.findVetBySpecialty(this.selectedSpecialty);
    }
}
