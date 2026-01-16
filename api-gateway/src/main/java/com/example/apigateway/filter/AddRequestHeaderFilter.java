package com.example.apigateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class AddRequestHeaderFilter implements GlobalFilter, Ordered {
    private static final Logger logger = LoggerFactory.getLogger(AddRequestHeaderFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest mutatedRequest = exchange.getRequest().mutate()
                .header("X-From-Gateway", "true")
                .build();
        ServerWebExchange mutatedExchange = exchange.mutate().request(mutatedRequest).build();
        logger.info("Added X-From-Gateway header in global filter");
        return chain.filter(mutatedExchange);
    }

    @Override
    public int getOrder() {
        // Order controls filter order; lower numbers run earlier
        return -1;
    }
}
