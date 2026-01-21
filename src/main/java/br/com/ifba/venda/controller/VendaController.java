package br.com.ifba.venda.controller;

import br.com.ifba.venda.entity.Venda;
import br.com.ifba.venda.service.VendaIService; // Use a interface do Service aqui
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VendaController implements VendaIController {
    
    private final VendaIService vendaService;

    @Autowired
    public VendaController(VendaIService vendaService) {
        this.vendaService = vendaService;
    }
    
    @Override
    public Venda save(Venda entity) {
        return vendaService.save(entity);
    }

    @Override
    public List<Venda> findAll() { // Corrigido: era List<Compra>
        return vendaService.findAll();
    }

    @Override
    public void delete(Venda entity) {
        vendaService.delete(entity);
    }

    @Override
    public Venda findById(Long id) {
        return vendaService.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        vendaService.deleteById(id);
    }
}