package com.lab.gled;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 *
 * @author gledson
 */

@SpringBootApplication
//@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@OpenAPIDefinition(info = @Info(title="Metadata Management API", version="1.0", description ="Gled Lab"))
@EnableJpaAuditing
public class MetadataManagement {

    public static void main(String[] args) {
        SpringApplication.run(MetadataManagement.class, args);
    }
}
