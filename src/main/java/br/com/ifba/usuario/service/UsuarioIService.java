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
public interface UsuarioIService {
    
    public Usuario save(Usuario user);
    public Usuario findByID(Long id);
    public List<Usuario> findAll();
    public Usuario update(Usuario user);
    void delete(Usuario user);
    boolean login(Usuario user);
}
