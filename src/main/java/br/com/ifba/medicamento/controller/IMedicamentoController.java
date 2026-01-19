package br.com.ifba.medicamento.controller;

import br.com.ifba.medicamento.entity.Medicamento;
import java.util.List;

public interface IMedicamentoController {
    public Medicamento save(Medicamento medicamento);
    public Medicamento update(Medicamento medicamento);
    public void delete(Medicamento medicamento);
    public List<Medicamento> findAll();
    public Medicamento findById(Long id);
}