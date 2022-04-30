package com.tads.projetodac.model;


import com.tads.projetodac.facade.EstadoFacade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * ESTADO
 */
@Entity
@Table(name = "estado")
public class Estado {

    private int id;
    private String nome;
    private String uf;

    public Estado() {
    }

    public Estado(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "sigla")
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public static Estado buscarPorUf(String uf) {
        return EstadoFacade.buscarPorUf(uf);
    }

}
