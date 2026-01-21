/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.service;

import br.com.ifba.fornecedor.entity.Fornecedor;
import br.com.ifba.fornecedor.repository.FornecedorRepository;

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
public class FornecedorService implements FornecedorIService {
    
    @Autowired
    private FornecedorRepository fornecedorRepository;
    
    
    @Override
    public Fornecedor save(Fornecedor fornecedor) throws RuntimeException{
        log.info("Realizando tentativa de salvar fornecedor");
        
        if(fornecedor == null){
            log.info("Erro na tentativa: Dados não localizados");
            throw new RuntimeException("Dados não localizados.");
            
        } else if (fornecedor.getId() != null){
            log.info("Erro na tentativa: Informações já encontradas na base de dados");
            throw new RuntimeException("Não foi possivel salvar dados: Informações já encontradas na base de dados.");
            
        } else if (fornecedor.getCnpj().isBlank() || fornecedor.getRazaoSocial().isBlank()){
            log.info("Erro na tentativa: Informações obrigatóras não preenchidas");
            throw new RuntimeException("Informações obrigatóras não preenchidas.");
            
        } else {
            try{
                return fornecedorRepository.save(fornecedor);
                
            } catch (Exception e){
                log.info("Erro na tentativa: Erro de persistencia");
                throw new RuntimeException("Ocorreu um erro inesperado, não foi possivel salvar as informações. Tente novamente mais tarde.");
            }
        }
    }
    
    @Override
    public Fornecedor update(Fornecedor fornecedor) throws RuntimeException{
        
        log.info("Realizando tentativa de atualizar fornecedor");
        
        if(fornecedor == null){
            log.info("Erro na tentativa: Dados não localizados");
            throw new RuntimeException("Dados não localizados.");
            
        } else if (this.findById(fornecedor.getId()) == null){
            log.info("Erro na tentativa: Informações não disponiveis encontradas na base de dados");
            throw new RuntimeException("Não foi possivel atualizar dados: Informações não disponiveis na base de dados.");
            
        } else if (fornecedor.getCnpj().isBlank() || fornecedor.getRazaoSocial().isBlank()){
            log.info("Erro na tentativa: Informações obrigatórias não preenchidas");
            throw new RuntimeException("Informações obrigatórias não preenchidas.");
            
        } else {
            try{
                return fornecedorRepository.save(fornecedor);
                
            } catch (Exception e){
                log.info("Erro na tentativa: Erro de persistencia");
                throw new RuntimeException("Ocorreu um erro inesperado, não foi possivel salvar as informações. Tente novamente mais tarde.");
            }
        }
    }
    
    @Override
    public void delete(Fornecedor fornecedor) throws RuntimeException{
        log.info("Realizando tentativa de deletar fornecedor");
        
        if(fornecedor == null){
            log.info("Erro na tentativa: Dados não localizados");
            throw new RuntimeException("Dados não localizados.");
            
        } else if (this.findById(fornecedor.getId()) == null) {
            log.info("Erro na tentativa: Informações não disponiveis encontradas na base de dados");
            throw new RuntimeException("Não foi possivel deletar dados: Informações não disponiveis na base de dados.");
            
        } else {
            try{
                fornecedorRepository.delete(fornecedor);
            
            } catch (Exception e){
                log.info("Erro na tentativa: Erro de persistencia");
                throw new RuntimeException("Ocorreu um erro inesperado, não foi possivel deletar as informações. Tente novamente mais tarde.");
            }
        }
    }
    
    @Override
    public List<Fornecedor> findAll() throws RuntimeException{
        return fornecedorRepository.findAll();
    }
    
    @Override
    public Fornecedor findById(Long ID) throws RuntimeException{
        return fornecedorRepository.findById(ID).orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));
    }
}
