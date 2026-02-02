/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.convenio.controller;

import br.com.ifba.convenio.entity.Convenio;
import java.util.List;

/**
 *
 * @author ianep
 */
public interface ConvenioIController {
    
    Convenio save(Convenio convenio);
    
    Convenio findById(Long id);
    
    List<Convenio> findAll();
    
    Convenio update(Convenio convenio);
    
    void delete(Convenio convenio);
    
}
