package br.com.servico.agendatelefonica.config;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfiguration {
    @Bean
   public OpenAPI defineOpenApi() {
       Server server = new Server();
       server.setUrl("https://agendatelefonica3-production.up.railway.app");
       server.setDescription("Develop");

       Contact myContact = new Contact();
       myContact.setName("Thiago Amorim");
       myContact.setEmail("thiago.amorim_2@live.com");

       Info information = new Info()
               .title("Sistema de Agenda Telefônica")
               .version("1.0")
               .description("Essa API expõe endpoints para gestão de agenda telefônica.")
               .contact(myContact);
       return new OpenAPI().info(information).servers(Arrays.asList(server));
   }
}
