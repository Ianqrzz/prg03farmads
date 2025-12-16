/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.service;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;

/**
 *
 * @author ianep
 */
public interface IUsuarioService {
    
    public Usuario saveUser(Usuario user);
    public Usuario getUsuarioByID(Long id);
    public List<Usuario> findAllUsers();
    public Usuario updateUsuario(Usuario user);
    void deleteUser(Usuario user);
}
