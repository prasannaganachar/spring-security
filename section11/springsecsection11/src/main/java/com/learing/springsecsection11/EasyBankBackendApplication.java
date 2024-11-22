package com.learing.springsecsection11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
/*@EnableJpaRepositories("com.learing.springsecsection4.repository")
@EntityScan("com.learing.springsecsection4.model")*/
@EnableWebSecurity()
@EnableMethodSecurity(jsr250Enabled = true,securedEnabled = true)
public class EasyBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyBankBackendApplication.class, args);
	}

}