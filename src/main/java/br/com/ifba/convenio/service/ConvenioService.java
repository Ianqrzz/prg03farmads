/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.convenio.service;

import br.com.ifba.convenio.entity.Convenio;
import br.com.ifba.convenio.repository.ConvenioRepository;
import br.com.ifba.infrastructure.util.StringUtil;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author ianep
 */
@Service
public class ConvenioService implements ConvenioIService{
    
    private final ConvenioRepository convenioRepository;
    
    public ConvenioService(ConvenioRepository convenioRepository){
        this.convenioRepository = convenioRepository;
        
    }
    
     private static final Logger log = LoggerFactory.
            getLogger(ConvenioService.class);
    
    
    @Override
    public Convenio save(Convenio convenio) {
        
        if(StringUtil.isNullOrEmpty(convenio.getNome())){
            throw new RuntimeException("Nome do convenio não preenchido");
        }
        
        if(convenio.getDesconto() != null && convenio.getDesconto().signum() != 0){
            log.info("Valor de desconto validado");
        } else {
            throw new RuntimeException("Valor de desconto invalido");
        }
        
        log.info("Salvando novo Convenio");
        return convenioRepository.save(convenio);
    }

    @Override
    public Convenio findById(Long id) {
        return convenioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Convenio> findAll() {
        return convenioRepository.findAll();
    }

    @Override
    public Convenio update(Convenio convenio) {
        if(convenio == null){
            throw new RuntimeException("dados do convenio não preenchidos");
        }else{
            log.info("Atualizando convenio");
            return convenioRepository.save(convenio);
        }
    }

    @Override
    public void delete(Convenio convenio) {
        if(convenio == null){
            throw new RuntimeException("Dados do " + "Convenio não preenchidos.");
        }else if(convenio.getId() == null){
            throw new RuntimeException("Convenio não existente no banco de dados");
        }else{
            log.info("Excluindo o Convenio");
            convenioRepository.delete(convenio);
        }    
    }
    
}
