package com.tads.projetodac.facade;

import com.tads.projetodac.dao.EstadoDAO;
import com.tads.projetodac.model.Estado;
import java.util.List;

/**
 *
 * EstadoFacade
 */
public class EstadoFacade {

    public static List<Estado> buscar() {
        return EstadoDAO.buscar();
    }

    public static Estado buscarPorUf(String uf) {
        return EstadoDAO.buscarPorUf(uf);
    }

}
