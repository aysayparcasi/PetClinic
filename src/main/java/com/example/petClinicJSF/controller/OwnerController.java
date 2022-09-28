package com.example.petClinicJSF.controller;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.service.OwnerService;
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
public class OwnerController {
    private Owner owner;
    private Owner selectedOwner;
    private List<Owner> ownerList;

    @Autowired
    private OwnerService ownerService;

    @PostConstruct
    public void init(){
        this.owner = new Owner();
        this.ownerList = ownerService.findAll();
    }

    public void save (){
        this.ownerService.save(this.owner);

        infoMessage("Kaydedildi",
                "Kaydedilen Hayvan Sahibi : ",this.owner);
        this.ownerList.add(owner);
        this.owner = new Owner();
    }

    public void delete(Owner owner){
        this.ownerService.delete(owner);
        infoMessage("Silindi", "Silinen Hayvan Sahibi : " ,owner);
        this.ownerList.remove(owner);
    }

    public void update(){
        this.ownerService.update(this.selectedOwner);
        infoMessage("Güncellendi.",
                "Güncellenen Hayvan Sahibi : ",this.selectedOwner);
        this.selectedOwner = new Owner();

    }
    public void infoMessage(String summary, String detail, Owner owner) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,
                new FacesMessage(summary,
                        detail + owner.getFirstName() + owner.getLastName()));
    }

    public void selectOwner(Owner owner){
        this.selectedOwner = owner;
    }


}
