package com.learing.springOAuth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/secure").authenticated()
                .anyRequest().permitAll());
        httpSecurity.formLogin(Customizer.withDefaults());
        httpSecurity.oauth2Login(Customizer.withDefaults());

        return httpSecurity.build();
    }

   /* @Bean
    ClientRegistrationRepository clientRegistrationRepository() {
        ClientRegistration github = githubClientRegistration();
        ClientRegistration facebook = facebookClientRegistration();
        return new InMemoryClientRegistrationRepository(github,facebook);
    }

    private ClientRegistration githubClientRegistration() {

       return CommonOAuth2Provider.GITHUB.getBuilder("github")
                .clientId("Ov23liySzWTFVb7Znx9Y")  // personal  github account client and secret
                .clientSecret("b63cefa8e61b78f6186c1c8f2b3b940ea657f45a").build();
    }

    private ClientRegistration facebookClientRegistration() {

        return CommonOAuth2Provider.FACEBOOK.getBuilder("FACEBOOK")
                .clientId("1206659257103952")
                .clientSecret("9ac3cb72763a59069997e331006a4824").build();
    }*/
}
