package com.example.petClinicJSF.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
// ( ad soyad, iletişim bilgileri, telefon, e-posta )
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Column(name = "address")
    @NotNull
    private String address;

    @Column(name = "city")
    @NotNull
    private String city;

    @Column(name = "telephone")
    @NotNull
    private String telephone;

    @Column(name = "email")
    @NotNull
    private String email;


    public Owner() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return getId().equals(owner.getId())
                && Objects.equals(getAddress(), owner.getAddress())
                && Objects.equals(getCity(), owner.getCity())
                && Objects.equals(getEmail(), owner.getEmail())
                && Objects.equals(getTelephone(), owner.getTelephone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),getAddress(),getCity(),getEmail(),getTelephone());
    }
}
