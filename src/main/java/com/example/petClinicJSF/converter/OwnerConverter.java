package com.example.petClinicJSF.converter;

import com.example.petClinicJSF.model.entity.Owner;
import com.example.petClinicJSF.model.entity.PetType;
import com.example.petClinicJSF.serviceImp.OwnerServiceImp;
import com.example.petClinicJSF.serviceImp.PetTypeServiceImp;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Component
@FacesConverter(value = "ownerConverter")
public class OwnerConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {

        if (value == null || value.equals("")) {
            return null;
        }
        OwnerServiceImp ownerServiceImp = context.getApplication()
                .evaluateExpressionGet(context, "#{ownerServiceImp}"
                        , OwnerServiceImp.class);
        return ownerServiceImp.findById(Long.parseLong(value));
    }



    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Owner) {
            return String.valueOf(((Owner) value).getId());
        }
        return "";
    }

}