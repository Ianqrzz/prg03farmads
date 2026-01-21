/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.funcionarios.service;

import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.funcionarios.repository.FuncionariosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class FuncionariosService implements IFuncionariosService {
    // Logger manual (substituindo @Slf4j)

    private static final Logger log = Logger.getLogger(FuncionariosService.class.getName());

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Override
    public Funcionarios save(Funcionarios funcionarios) {
        log.info("SERVICE: Salvando funcionario: " + funcionarios.getNome());
        return funcionariosRepository.save(funcionarios);
    }

    @Override
    public List<Funcionarios> findAll() {
        log.info("SERVICE: Listando todos os funcionarios");
        return funcionariosRepository.findAll();
    }

    @Override
    public Funcionarios findById(Long id) {
        log.info("SERVICE: Buscando Funcionario ID: " + id);
        return funcionariosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado para o ID: " + id));
    }

    @Override
    public Funcionarios update(Long id, Funcionarios funcionarios) {
        // Garante que o objeto que está sendo salvo tem o ID correto da URL/Parâmetro
        funcionarios.setId(id);
        return funcionariosRepository.save(funcionarios);
    }

    @Override
    public void delete(Long id) {
        log.info("SERVICE: Deletando Funcionario ID: " + id);
        if (!funcionariosRepository.existsById(id)) {
            throw new RuntimeException("Funcionario não encontrado para o ID: " + id);
        }
        funcionariosRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        funcionariosRepository.deleteById(id);
    }

}
