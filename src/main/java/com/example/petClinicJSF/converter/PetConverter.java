package com.example.petClinicJSF.converter;


import com.example.petClinicJSF.model.entity.Pet;
import com.example.petClinicJSF.serviceImp.PetServiceImp;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Component
@FacesConverter(value = "petConverter")
public class PetConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {

        if (value == null || value.equals("")) {
            return null;
        }
        PetServiceImp petServiceImp = context.getApplication()
                .evaluateExpressionGet(context, "#{petServiceImp}"
                        , PetServiceImp.class);
        return petServiceImp.findByName(value);
    }



    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Pet) {
            return ((Pet) value).getName();
        }
        return "";
    }

}