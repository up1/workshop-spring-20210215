package com.example.workshop.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    private final RestTemplate restTemplate;
    private final String userApiUrl;

    @Autowired
    public UserGateway(RestTemplate restTemplate,
                       @Value("${user.api.url}") String userApiUrl) {
        this.restTemplate = restTemplate;
        this.userApiUrl = userApiUrl;
    }
}
