/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcionarios.service;

import br.com.ifba.funcionarios.entity.Funcionarios;
import java.util.List;
/**
 *
 * @author Arkins
 */
public interface IFuncionariosService {

    Funcionarios save(Funcionarios funcionarios);

    List<Funcionarios> findAll();

    Funcionarios findById(Long id);

    Funcionarios update(Long id, Funcionarios funcionarios);

    void delete(Long id);
    
    public void deleteById(Long id);

}
