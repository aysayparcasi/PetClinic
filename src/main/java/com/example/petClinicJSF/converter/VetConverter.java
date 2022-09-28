package com.example.petClinicJSF.converter;


import com.example.petClinicJSF.model.entity.Vet;

import com.example.petClinicJSF.serviceImp.VetServiceImp;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Component
@FacesConverter(value = "vetConverter")
public class VetConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {

        if (value == null || value.equals("")) {
            return null;
        }
        VetServiceImp vetServiceImp = context.getApplication()
                .evaluateExpressionGet(context, "#{vetConverter}"
                        , VetServiceImp.class);
        return vetServiceImp.findById(Long.parseLong(value));
    }



    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Vet) {
            return String.valueOf(((Vet) value).getId());
        }
        return "";
    }

}
