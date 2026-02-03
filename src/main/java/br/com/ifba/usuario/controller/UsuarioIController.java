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
public interface UsuarioIController {

    Usuario save(Usuario user);

    Usuario findById(Long id);

    List<Usuario> FindAll();

    Usuario update(Usuario user);

    void delete(Usuario user);

    // Método antigo (pode manter se usar em outros lugares)
    boolean login(Usuario user);

    // --- NOVOS MÉTODOS PARA O LOGIN E TELA INICIAL ---
    // Valida se o login e senha batem
    boolean validarLogin(String login, String senha);

    // Busca os dados do usuário (nome, id) pelo login
    Usuario buscarPorLogin(String login);
}
