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

//tür,cins,isim,yaş,açıklama tür:kedi cins:siyam



@Entity
@Table(name = "pets")
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

 public Owner getOwner() {
  return owner;
 }


 public void setOwner(Owner owner) {
  this.owner = owner;
 }

 public String getBreed() {
  return breed;
 }

 public void setBreed(String breed) {
  this.breed = breed;
 }

 public Date getBirthDate() {
  return birthDate;
 }

 public void setBirthDate(Date birthDate) {
  this.birthDate = birthDate;
 }

 public PetType getType() {
  return type;
 }

 public void setType(PetType type) {
  this.type = type;
 }

 public String getExplanation() {
  return explanation;
 }

 public void setExplanation(String explanation) {
  this.explanation = explanation;
 }
}
