package com.learing.springsecsection9.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Authanetication {

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent successEvent) {
        log.info("Authentication Success {}", successEvent.getAuthentication().getName());
    }

    @EventListener
    public void onfailure(AbstractAuthenticationFailureEvent failureEvent) {
        log.info("Authentication Failed for the user: {} and reason: {}",
                failureEvent.getAuthentication().getName(), failureEvent.getException().getMessage());
    }
}
