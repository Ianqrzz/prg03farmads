/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.service;

import br.com.ifba.infrastructure.util.StringUtil;
import br.com.ifba.usuario.entity.Usuario;
import java.util.List;
import br.com.ifba.usuario.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author ianep
 */
@Service
public class UsuarioService implements IUsuarioService{

    
    private final UsuarioRepository usuarioRepository;
    
     public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
     private static final Logger log = LoggerFactory.
            getLogger(UsuarioService.class);
    @Override
    public Usuario saveUser(Usuario user) {
        
        if (StringUtil.isNullOrEmpty(user.getLogin())){
            
            throw new RuntimeException("Login do " + "Usuario não preenchidos.");
            
        }
       
        if(StringUtil.isNullOrEmpty(user.getSenha())){
            
            
            throw new RuntimeException("Senha " + "Não preenchida.");
        }
        log.info("Salvando novo Usuario");
        return usuarioRepository.save(user);
    }

    @Override
    public Usuario getUsuarioByID(Long id) {
        return usuarioRepository.findById(id).orElse(null);
   }

    @Override
    public List<Usuario> findAllUsers() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario updateUsuario(Usuario user) {
        if(user == null){
            throw new RuntimeException("Dados do " + "usuario não preenchidos.");
        }else{
            log.info("Editando o Usuario");
            return usuarioRepository.save(user);
        }
    }

    @Override
    public void deleteUser(Usuario user) {
        if(user == null){
            throw new RuntimeException("Dados do " + "Usuario não preenchidos.");
        }else if(user.getId() == null){
            throw new RuntimeException("Usuario não existente no banco de dados");
        }else{
            log.info("Excluindo o Objeto Curso");
            usuarioRepository.delete(user);
        }      
    }

    
    
}
