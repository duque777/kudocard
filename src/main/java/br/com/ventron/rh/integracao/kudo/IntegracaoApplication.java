package br.com.ventron.rh.integracao.kudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableJpaRepositories
public class IntegracaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegracaoApplication.class, args);
    }
}
