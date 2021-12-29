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
public class SimpleRouterWithPathVar {
    @Bean
    public RouterFunction<ServerResponse> simpleWithPathVar() {
        return route(GET("/simple/{pathvar}"),
                req -> ok().body(fromValue("simple "+req.pathVariable("pathvar")))) ;
    }
}
