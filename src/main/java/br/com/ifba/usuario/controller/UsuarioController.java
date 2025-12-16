/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ianep
 */
@Controller
public class UsuarioController implements IUsuarioController{
    
    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public Usuario save(Usuario user) {
        return usuarioService.saveUser(user);
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioService.getUsuarioByID(id);

    }

    @Override
    public List<Usuario> FindAll() {
        return usuarioService.findAllUsers();
    }

    @Override
    public Usuario update(Usuario user) {
        return usuarioService.updateUsuario(user);
    }

    @Override
    public void delete(Usuario user) {
        usuarioService.deleteUser(user);
    }
    
    
}
