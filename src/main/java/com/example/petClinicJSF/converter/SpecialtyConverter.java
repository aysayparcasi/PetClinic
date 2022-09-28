package com.example.petClinicJSF.converter;


import com.example.petClinicJSF.model.entity.Specialty;
import com.example.petClinicJSF.serviceImp.SpecialtyImp;
import org.springframework.stereotype.Component;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Component
@FacesConverter(value = "specialtyConverter")
public class SpecialtyConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {

        if (value == null || value.equals("")) {
            return null;
        }
        SpecialtyImp specialtyImp = context.getApplication()
                .evaluateExpressionGet(context, "#{specialtyConverter}"
                        , SpecialtyImp.class);
        return specialtyImp.findById(Long.parseLong(value));
    }



    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Specialty) {
            return String.valueOf(((Specialty) value).getId());
        }
        return "";
    }
}
