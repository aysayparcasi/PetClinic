package com.example.petClinicJSF.controller;

import com.example.petClinicJSF.model.entity.User;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class LoginController implements Serializable {
    private User user;

    public String Login(){
        //kullanıcı adı ve şifre kontrolü
        //eğer mevcutsa: sessionAttribute valid user
        if (this.user.getUsername().equals("root") && this.user.getPassword().equals("root")){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("valid_user",this.user);
            return "/index?faces-redirect=true";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hatalı Kullanıcı Adı Ve Şifre"));
            return "/login";
        }
    }
    public User getUser() {
        if (this.user == null)
            this.user = new User();
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
