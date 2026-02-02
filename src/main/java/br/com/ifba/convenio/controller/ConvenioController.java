/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.convenio.controller;

import br.com.ifba.convenio.entity.Convenio;
import br.com.ifba.convenio.service.ConvenioIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ianep
 */
@Controller
public class ConvenioController implements ConvenioIController{

    @Autowired
    private ConvenioIService convenioService;
    
    @Override
    public Convenio save(Convenio convenio) {
        return convenioService.save(convenio);
    }

    @Override
    public Convenio findById(Long id) {
        return convenioService.findById(id);
    }

    @Override
    public List<Convenio> findAll() {
        return convenioService.findAll();
    }

    @Override
    public Convenio update(Convenio convenio) {
        return convenioService.update(convenio);
    }

    @Override
    public void delete(Convenio convenio) {
        convenioService.delete(convenio);
    }
    
}
