package com.tads.projetodac.converter;

import com.tads.projetodac.model.Estado;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;

/**
 *
 * EstadoConverter
 */
@FacesConverter(value = "estadoConverter", forClass = Estado.class)
public class EstadoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context,
            UIComponent component, String value) {
        return Estado.buscarPorUf(value);
    }

    @Override
    public String getAsString(FacesContext context,
            UIComponent component, Object value) {
        return ((Estado) value).getUf();
    }

}
