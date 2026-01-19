package br.com.ifba.medicamento.service;

import br.com.ifba.medicamento.entity.Medicamento;
import java.util.List;

public interface IMedicamentoService {
    public Medicamento save(Medicamento medicamento);
    public Medicamento update(Medicamento medicamento);
    public void delete(Medicamento medicamento);
    public List<Medicamento> findAll();
    public Medicamento findById(Long id);
}