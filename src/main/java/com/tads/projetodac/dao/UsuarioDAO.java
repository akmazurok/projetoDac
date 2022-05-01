/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tads.projetodac.dao;

import com.tads.projetodac.model.Usuario;
import com.tads.projetodac.util.HibernateUtil;
import org.hibernate.Session;


public class UsuarioDAO {

    public static boolean cadastrar(Usuario usuario) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return false;
    }
}
