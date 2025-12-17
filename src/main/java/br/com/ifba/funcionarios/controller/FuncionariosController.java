/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.funcionarios.controller;

import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.funcionarios.service.IFuncionariosService;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 *
 * @author Arkins
 */
@Controller
public class FuncionariosController implements IFuncionariosController {
     @Autowired
    private IFuncionariosService funcionariosService;

    @Override
    @Transactional
    public Funcionarios save(Funcionarios funcionarios) {
        return funcionariosService.save(funcionarios);
    }

    @Override
    public List<Funcionarios> findAll() {
        return funcionariosService.findAll();
    }

    @Override
    public Funcionarios findById(Long id) {
        return funcionariosService.findById(id);
    }

    @Override
    public Funcionarios update(Long id,Funcionarios funcionarios) {
        // Assume-se que o ID já está no objeto produto
        return funcionariosService.update(funcionarios.getId(), funcionarios);
    }

    @Override
    public void delete(Long id) {
        funcionariosService.delete(id);
    }

    @Override
    public List<Funcionarios> listAll() {
        return funcionariosService.findAll();    
    }
    
    @Override
    @Transactional
    public void deleteById(Long id) {
        funcionariosService.deleteById(id);
}

}
