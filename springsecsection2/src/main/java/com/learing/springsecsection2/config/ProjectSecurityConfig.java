package com.learing.springsecsection2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
   // @Order(2147483642)
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> {
            //((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.anyRequest()).authenticated();
            requests
                    .requestMatchers("/account","/loans","/balance","/cards").authenticated()
                    .requestMatchers("/notices","/contact","/error").permitAll();
        });
        //http.formLogin(Customizer.withDefaults());
        http.formLogin(flc -> flc.disable());

        http.httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();
    }
}
