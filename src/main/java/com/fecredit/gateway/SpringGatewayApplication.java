package com.fecredit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration;

@SpringBootApplication(exclude = {
		GroovyTemplateAutoConfiguration.class})
public class SpringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayApplication.class, args);
	}

}
