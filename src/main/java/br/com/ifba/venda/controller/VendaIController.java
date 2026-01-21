/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.venda.controller;

import br.com.ifba.venda.entity.Venda;
import java.util.List;

public interface VendaIController {
    Venda save(Venda entity);
    List<Venda> findAll();
    void delete(Venda entity);
    Venda findById(Long id);
    void deleteById(Long id);
}