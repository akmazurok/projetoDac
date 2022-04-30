package com.tads.projetodac.mb;

import com.tads.projetodac.facade.EstadoFacade;
import com.tads.projetodac.model.Estado;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author akmaz
 */
@SessionScoped
@Named(value = "EstadoMB")
public class EstadoMB implements Serializable {

    private Estado selecionado;
    private List<Estado> estados;
    private List<Estado> estadoss;

    public EstadoMB() {
    }

    @PostConstruct
    public void init() {
        this.buscarEstados();
    }

    public void buscarEstados() {
        this.estados = EstadoFacade.buscar();
        FacesContext context = FacesContext.getCurrentInstance();
        if (this.estados == null || this.estados.isEmpty()) {
            context.addMessage("msg", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível carregar os estados!"));
        }
    }


    public Estado getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(Estado selecionado) {
        this.selecionado = selecionado;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

}
