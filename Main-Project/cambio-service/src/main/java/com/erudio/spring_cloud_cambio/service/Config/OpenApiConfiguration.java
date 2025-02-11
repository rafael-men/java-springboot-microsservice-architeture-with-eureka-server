package com.erudio.spring_cloud_cambio.service.Config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info = @Info(title = "Cambio Service API for Microsservices",version = "v0.0.1",description = "Documentation of cambio service api"))
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Cambio Service API for Microservices")
                        .version("v0.0.1")
                        .description("Documentation of Cambio Service API"));
    }
}
