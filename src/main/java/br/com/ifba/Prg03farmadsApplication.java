package br.com.ifba;

import br.com.ifba.view.TelaInicial;
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

        TelaInicial telaPrincipal = context.getBean(TelaInicial.class);

        telaPrincipal.setVisible(true);
    }
}
