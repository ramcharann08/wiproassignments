package com.example.deliveryclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.cloud.client.circuitbreaker.annotation.CircuitBreaker;

import java.util.Map;
import java.util.HashMap;

@Service
public class DeliveryService {

    private final RestTemplate restTemplate;

    @Value("${delivery.service.url}")
    private String deliveryServiceUrl;

    public DeliveryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // name = "deliveryService" must match the resilience4j config keys in application.properties
    @CircuitBreaker(name = "deliveryService", fallbackMethod = "deliveryStatusFallback")
    public Map<String, Object> getDeliveryStatus(String id, boolean simulateFail) {
        String url = UriComponentsBuilder.fromHttpUrl(deliveryServiceUrl)
                .queryParam("id", id)
                .queryParam("fail", simulateFail)
                .toUriString();

        // If external service returns 5xx, RestTemplate throws an exception and circuit-breaker triggers fallback
        Map<?, ?> resp = restTemplate.getForObject(url, Map.class);
        // cast to a safe Map<String,Object> for response
        return new HashMap<>( (Map<String,Object>) resp );
    }

    // fallback method signature: same parameters + Throwable as last param
    public Map<String, Object> deliveryStatusFallback(String id, boolean simulateFail, Throwable t) {
        Map<String,Object> fallback = new HashMap<>();
        fallback.put("id", id);
        fallback.put("status", "UNKNOWN");
        fallback.put("message", "Fallback: external delivery service unavailable");
        fallback.put("exception", t == null ? "none" : t.getClass().getSimpleName());
        return fallback;
    }
}
