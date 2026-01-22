/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.receita.service;

import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.receita.entity.Receita;
import br.com.ifba.receita.repository.ReceitaRepository;
import jakarta.persistence.PersistenceException;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
 *
 * @author paulo
 */
@Service
@Slf4j
@NoArgsConstructor
public class ReceitaService implements ReceitaIService {
    
    @Autowired
    private ReceitaRepository receitaRepository;
    
    
    @Override
    public Receita save(Receita receita) throws RuntimeException{
        log.info("Realizando tentativa de salvar receita");
        
        if (receita == null){
            // Verifica se os dados não são nulos
            log.info("Falha na tentativa: Dados não localizados");
            throw new RuntimeException("Dados não Localizados");
            
        }else if (receita.getCliente() == null){
            // Verifica se o cliente não é nulo
            log.info("Falha na tentativa: Cliente não localizado");
            throw new RuntimeException("Cliente não localizado");
            
        } else if (receita.getCliente().getCpf().isBlank() || receita.getCliente().getNome().isBlank()){ 
            // Verifica se as informações do cliente não são nulas
            log.info("Falha na tentativa: Não foi possivel obter dados do cliente");
            throw new RuntimeException("Não foi possivel obter dados do cliente");
            
        } else if (receita.getNomeMedico().isBlank() ||
                   receita.getCrmMedico().isBlank() ||
                   receita.getNomeRemedio().isBlank() ||
                   receita.getDosagem() <= 0 ||
                   receita.getModoUso().isBlank() ||
                   receita.getDataEmissao() == null){
            // Verifica se as informações obrigatórias foram preenchidas
            log.info("Falha na tentativa: Informações obrigatórias não preenchidas");
            throw new RuntimeException("Informações obrigatórias não preenchidas");
            
        } else {
            try{
                // Tenta salvar e retorna o novo objeto se tudo der certo
                return receitaRepository.save(receita);
            } catch (PersistenceException e){
                //Avisa se tudo der merda...
                log.info("Falha na Tentativa: Falha de persistencia");
                throw new RuntimeException("Falha de persistencia");
            }
        }
    }
    
    @Override
    public List<Receita> findAll() throws RuntimeException{
        return receitaRepository.findAll();
    }
    
    @Override
    public Receita findById(Long ID) throws RuntimeException{
        return receitaRepository.findById(ID).orElseThrow(() -> new RuntimeException("Receita não encontrada"));
    }
    
    @Override
    public Receita findByCliente(Cliente cliente) throws RuntimeException{
        return receitaRepository.findByCliente(cliente);
    }
    
    
}
