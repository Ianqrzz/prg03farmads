package br.com.ifba;

import br.com.ifba.produto.view.ProdutoListar; // Importamos a sua tela
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

        // temporario para testar o CRUD PRODUTOS, remover no projeto final
        ProdutoListar telaPrincipal = context.getBean(ProdutoListar.class);

        telaPrincipal.setVisible(true);
    }
}
