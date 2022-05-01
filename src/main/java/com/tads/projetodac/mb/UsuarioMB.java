package com.tads.projetodac.mb;

import com.tads.projetodac.facade.UsuarioFacade;
import com.tads.projetodac.model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "usuarioMB")
@SessionScoped
public class UsuarioMB implements Serializable {

    Usuario usuario = new Usuario();

    public UsuarioMB() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String cadastrar() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (!UsuarioFacade.cadastrar(this.usuario)) {
            context.addMessage("msg", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível realizar cadastro!"));
            return "cadastro";
        }
        context.addMessage("msg", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuário adastrado com sucesso!"));
        return "index";
    }

}
