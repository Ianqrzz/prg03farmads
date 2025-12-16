/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;

/**
 *
 * @author ianep
 */
public interface IUsuarioController {
    
    Usuario save(Usuario user);
    
    Usuario findById(Long id);
    
    List<Usuario> FindAll();
    
    Usuario update(Usuario user);
    
    void delete(Usuario user);
}
