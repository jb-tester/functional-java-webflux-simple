package com.mytests.functionalJavaWebFluxSimple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class SimpleRouter {
    @Bean
    public RouterFunction<ServerResponse> first() {
        return route(GET("/somepath/extra"),
                req -> ok().body(fromValue("super simple extra path fragment "))) ;
    }
      @Bean
    public RouterFunction<ServerResponse> supersimple() {
        return route(GET("/supersimple"),
                req -> ok().body(fromValue("super simple "))) ;
    }
}
