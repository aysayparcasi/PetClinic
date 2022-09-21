package com.example.petClinicJSF.converter;

import com.example.petClinicJSF.model.entity.PetType;
import com.example.petClinicJSF.serviceImp.PetTypeServiceImp;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Component
@FacesConverter(value = "petTypeConverter")
public class PetTypeConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {

        if (value == null || value.equals("")) {
            return null;
        }
        PetTypeServiceImp petTypeServiceImp = context.getApplication()
                .evaluateExpressionGet(context, "#{petTypeServiceImp}"
                        , PetTypeServiceImp.class);
        return petTypeServiceImp.findByName(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof PetType) {
            return ((PetType) value).getName();
        }
        return "";
    }
}
