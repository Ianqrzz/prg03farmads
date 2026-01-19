package br.com.ifba.medicamento.controller;

import br.com.ifba.medicamento.entity.Medicamento;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import br.com.ifba.medicamento.service.IMedicamentoService;

@Controller
@RequiredArgsConstructor
public class MedicamentoController implements IMedicamentoController {

    private final IMedicamentoService medicamentoService;

    @Override
    public Medicamento save(Medicamento medicamento) {
        return medicamentoService.save(medicamento);
    }

    @Override
    public Medicamento update(Medicamento medicamento) {
        return medicamentoService.update(medicamento);
    }

    @Override
    public void delete(Medicamento medicamento) {
        medicamentoService.delete(medicamento);
    }

    @Override
    public List<Medicamento> findAll() {
        return medicamentoService.findAll();
    }

    @Override
    public Medicamento findById(Long id) {
        return medicamentoService.findById(id);
    }
}