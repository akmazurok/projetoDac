package com.tads.projetodac.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * ENDERECO
 */
@Entity
@Table(name="endereco")
public class Endereco implements Serializable {

    private int id;
    private String endereco;
     private Estado estado;
    private Cidade cidade;

    public Endereco() {
        this.estado = new Estado();
        this.cidade = new Cidade();
    }

    public Endereco(String endereco, Estado estado, Cidade cidade) {
        this.endereco = endereco;
        this.estado = estado;
        this.cidade = cidade;
    }    

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="endereco")
     public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="estado_id")
    public Estado getEstado() {
        return estado;
    }
   

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cidade_id")
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

}

