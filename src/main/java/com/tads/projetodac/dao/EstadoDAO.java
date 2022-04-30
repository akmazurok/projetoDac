package com.tads.projetodac.dao;

import com.tads.projetodac.model.Estado;
import com.tads.projetodac.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * EstadoDAO
 */
public class EstadoDAO {

    public static List<Estado> buscar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Estado> estados = new ArrayList();
        try {
            session.beginTransaction();
            Query query = session.createQuery("FROM Estado");
            estados = query.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            estados = null;
        } finally {

            session.close();
        }
        return estados;
    }

    public static Estado buscarPorUf(String uf) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Estado estado = new Estado();
        try {
            session.beginTransaction();
            Query query = session.createQuery("FROM Estado as e WHERE e.sigla LIKE :uf");
            query.setString("uf", uf);
            estado = (Estado) query.uniqueResult();
            session.getTransaction().commit();
        } catch (Exception e) {
            estado = null;
        } finally {
            session.close();
        }
        return estado;
    }

}
