package com.tads.projetodac.converter;

import com.tads.projetodac.model.Cidade;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="cidadeConverter", forClass=Cidade.class)
public class CidadeConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String nome) {
        return Cidade.buscarPorNome(nome);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Cidade) value).getNome();
    }

}