package ru.ireco.account.gateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CloudGatewayApiConfig {

    @Value("${service.stock.uri}")
    private String stockUri;
    @Value("${service.stock.path.stock-quotes}")
    private String stockQuotes;

    private final TokenRelayGatewayFilterFactory filterFactory;

    CloudGatewayApiConfig(TokenRelayGatewayFilterFactory filterFactory) {
        this.filterFactory = filterFactory;
    }

    @Bean
    RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("get-stock-quotes", r -> r.path(stockQuotes)
                        .filters(f -> f.filter(filterFactory.apply()).removeRequestHeader("Cookie"))
                        .uri(stockUri))
                .build();
    }

}