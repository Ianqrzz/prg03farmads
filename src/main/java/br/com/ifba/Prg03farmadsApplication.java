package br.com.ifba;

import br.com.ifba.usuario.view.UsuarioLogin; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Prg03farmadsApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(Prg03farmadsApplication.class)
                        .headless(false)
                        .run(args);

        // MUDANÇA AQUI: Chama a tela de Login primeiro
        UsuarioLogin usuarioLogin = context.getBean(UsuarioLogin.class);
        usuarioLogin.setVisible(true);
    }
}