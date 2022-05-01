/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tads.projetodac.facade;

import com.tads.projetodac.dao.UsuarioDAO;
import com.tads.projetodac.model.Usuario;

public class UsuarioFacade {

    public static boolean cadastrar(Usuario usuario) {
        return UsuarioDAO.cadastrar(usuario);
    }
}
