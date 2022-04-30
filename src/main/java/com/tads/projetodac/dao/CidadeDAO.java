package com.tads.projetodac.dao;

import com.tads.projetodac.model.Cidade;
import com.tads.projetodac.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * CidadeDAO
 */
public class CidadeDAO {

    public static List<Cidade> buscarPorEstado(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Cidade> cidades = new ArrayList();
        try {
            Query query = session.createQuery("FROM Cidade as c WHERE c.id_estado = :id");
            query.setInteger("id", id);
            cidades = query.list();
        } catch (Exception e) {
            cidades = null;
        } finally {
            session.close();
        }
        return cidades;
    }

    public static Cidade buscarPorNome(String n) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Cidade cidade = new Cidade();
        try {
            Query query = session.createQuery("FROM Cidade as c WHERE c.nome LIKE :n");
            query.setString("n", n);
            cidade = (Cidade) query.uniqueResult();
        } catch (Exception e) {
            cidade = null;
        } finally {
            session.close();
        }
        return cidade;
    }
}
