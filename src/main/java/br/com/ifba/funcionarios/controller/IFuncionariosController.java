/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcionarios.controller;

import br.com.ifba.funcionarios.entity.Funcionarios;
import java.util.List;


/**
 *
 * @author Arkins
 */
public interface IFuncionariosController {
    
    Funcionarios save(Funcionarios funcionarios);

    List<Funcionarios> findAll();

    Funcionarios findById(Long id);

    Funcionarios update(Long id, Funcionarios funcionarios);

    void delete(Long id);

    public List<Funcionarios> listAll();

    public void deleteById(Long id);
}
