/*package com.api.gateway.config;


import org.springdoc.core.properties.AbstractSwaggerUiConfigProperties;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public SwaggerUiConfigProperties swaggerUiConfigProperties() {
        SwaggerUiConfigProperties props = new SwaggerUiConfigProperties();

        props.getUrls().add(
                new AbstractSwaggerUiConfigProperties.SwaggerUrl(
                        "Flight Service",
                        "/flight/v3/api-docs",
                        "flight"
                )
        );

        props.getUrls().add(
                new AbstractSwaggerUiConfigProperties.SwaggerUrl(
                        "Search Service",
                        "/search/v3/api-docs",
                        "search"
                )
        );

        props.getUrls().add(
                new AbstractSwaggerUiConfigProperties.SwaggerUrl(
                        "Booking Service",
                        "/booking/v3/api-docs",
                        "booking"
                )
        );

        props.getUrls().add(
                new AbstractSwaggerUiConfigProperties.SwaggerUrl(
                        "Payment Service",
                        "/payment/v3/api-docs",
                        "payment"
                )
        );

        props.getUrls().add(
                new AbstractSwaggerUiConfigProperties.SwaggerUrl(
                        "Security Service",
                        "/security/v3/api-docs",
                        "security"
                )
        );

        return props;
    }
}
*/