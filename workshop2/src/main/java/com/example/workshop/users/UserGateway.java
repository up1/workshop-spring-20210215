package com.example.workshop.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

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

    public Optional<UserXResponse> getUserById(int id) {
        String url = String.format("%s/users/%d", userApiUrl, id);

        try {
            return Optional.ofNullable(
                    restTemplate.getForObject(url, UserXResponse.class));
        } catch (RestClientException e) {
            return Optional.empty();
        }
    }

}
