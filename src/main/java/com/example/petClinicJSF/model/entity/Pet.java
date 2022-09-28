package com.example.petClinicJSF.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//tür,cins,isim,yaş,açıklama tür:kedi cins:siyam

@Entity
@Table(name = "pets")
@Getter
@Setter
public class Pet extends NamedEntity {

   @ManyToOne
   @JoinColumn(name = "owner_id")
   private Owner owner;

    @Column(name = "breed")
    private String breed; //hayvan cinsi-siyam kedisi

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType type; // hayvan türü

    @Column(name = "explanation")
    private String explanation;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //neden ALL:
    //Eğer pet silinirse onunla ilgili olan tüm visitsler birlikte kaydedilir ve güncellenir.
    private Set<Visit> visits = new LinkedHashSet<>();

}
