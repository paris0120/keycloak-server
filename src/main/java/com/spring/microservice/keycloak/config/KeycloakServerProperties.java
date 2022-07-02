package com.spring.microservice.keycloak.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
@Setter
@Getter
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "baeldung-realm.json";
    AdminUser adminUser = new AdminUser();

    // getters and setters
    @Getter
    @Setter
    public static class AdminUser {
        String username = "admin";
        String password = "admin";

        // getters and setters
    }
}