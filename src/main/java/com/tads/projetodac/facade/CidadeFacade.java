package com.tads.projetodac.facade;


import com.tads.projetodac.dao.CidadeDAO;
import com.tads.projetodac.model.Cidade;
import java.util.List;

/**
 *
 * CidadeFacade
 */
public class CidadeFacade {

    public static List<Cidade> buscarPorEstado(int id) {
        return CidadeDAO.buscarPorEstado(id);
    }

    public static Cidade buscarPorNome(String n) {
        return CidadeDAO.buscarPorNome(n);
    }
}
