/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.cliente;

import br.com.ifba.Prg03farmadsApplication;
import br.com.ifba.cliente.view.ClienteListar;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author PC
 */
public class ClientesTeste {
    public static void main(String[] args) {

        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(Prg03farmadsApplication.class)
                        .headless(false)
                        .run(args);

        // temporario para testar o CRUD PRODUTOS, remover no projeto final
        ClienteListar telaPrincipal = context.getBean(ClienteListar.class);

        telaPrincipal.setVisible(true);
    }
}
