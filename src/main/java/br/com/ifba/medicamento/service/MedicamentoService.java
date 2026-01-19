package br.com.ifba.medicamento.service;

import br.com.ifba.medicamento.entity.Medicamento;
import br.com.ifba.medicamento.repository.MedicamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicamentoService implements IMedicamentoService {

    private final MedicamentoRepository medicamentoRepository;

    @Override
    public Medicamento save(Medicamento medicamento) {
        // Validação simples (Regra de Negócio)
        if (medicamento.getNome() == null || medicamento.getNome().isEmpty()) {
            throw new RuntimeException("O Medicamento precisa ter um nome!");
        }
        return medicamentoRepository.save(medicamento);
    }

    @Override
    public Medicamento update(Medicamento medicamentoAtualizado) {
        // 1. BLINDAGEM: Busca o objeto que JÁ existe no banco
        Medicamento medicamentoDoBanco = findById(medicamentoAtualizado.getId());

        if (medicamentoDoBanco == null) {
            throw new RuntimeException("Não foi possível atualizar: Medicamento não encontrado!");
        }

        // 2. ATUALIZAÇÃO DOS CAMPOS DO PAI (Produto)
        medicamentoDoBanco.setNome(medicamentoAtualizado.getNome());
        medicamentoDoBanco.setPreco(medicamentoAtualizado.getPreco());
        medicamentoDoBanco.setQtdEstoque(medicamentoAtualizado.getQtdEstoque());
        medicamentoDoBanco.setCusto(medicamentoAtualizado.getCusto());
        medicamentoDoBanco.setEstoqueMin(medicamentoAtualizado.getEstoqueMin());

        // 3. ATUALIZAÇÃO DOS CAMPOS DO FILHO (Medicamento)
        medicamentoDoBanco.setLote(medicamentoAtualizado.getLote());
        medicamentoDoBanco.setDataValidade(medicamentoAtualizado.getDataValidade());
        medicamentoDoBanco.setClassificacaoLegal(medicamentoAtualizado.getClassificacaoLegal());
        medicamentoDoBanco.setPrincipioAtivo(medicamentoAtualizado.getPrincipioAtivo());

        // 4. SALVA O OBJETO MESCLADO
        return medicamentoRepository.save(medicamentoDoBanco);
    }

    @Override
    public void delete(Medicamento medicamento) {
        medicamentoRepository.delete(medicamento);
    }

    @Override
    public List<Medicamento> findAll() {
        return medicamentoRepository.findAll();
    }

    @Override
    public Medicamento findById(Long id) {
        return medicamentoRepository.findById(id).orElse(null);
    }
}
