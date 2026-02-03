/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.ifba.usuario.service.UsuarioIService;

/**
 *
 * @author ianep
 */
@Controller
public class UsuarioController implements UsuarioIController {
    
    @Autowired
    private UsuarioIService usuarioService;

    @Override
    public Usuario save(Usuario user) {
        return usuarioService.save(user);
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioService.findByID(id);
    }

    @Override
    public List<Usuario> FindAll() {
        return usuarioService.findAll();
    }

    @Override
    public Usuario update(Usuario user) {
        return usuarioService.update(user);
    }

    @Override
    public void delete(Usuario user) {
        usuarioService.delete(user);
    }
    
    @Override
    public boolean login(Usuario user) {
        return usuarioService.login(user);
    }

    // --- ADIÇÕES PARA O NOVO FLUXO ---

    @Override
    public boolean validarLogin(String login, String senha) {
        // Chama o service para verificar a senha
        return usuarioService.validarLogin(login, senha);
    }

    @Override
    public Usuario buscarPorLogin(String login) {
        // Chama o service para recuperar o objeto Usuario completo
        return usuarioService.buscarPorLogin(login);
    }
}