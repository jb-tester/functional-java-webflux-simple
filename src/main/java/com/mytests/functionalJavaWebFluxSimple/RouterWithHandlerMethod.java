package com.mytests.functionalJavaWebFluxSimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class RouterWithHandlerMethod {

    @Autowired
    private PersonService personService;

    @Bean
    public RouterFunction<ServerResponse> withHandlerCall() {
        return route(GET("/test2"), this::getSomeBody) ;
    }

    private Mono<ServerResponse> getSomeBody(ServerRequest serverRequest) {
        return ServerResponse.ok().body(personService.getSinglePerson(), Person.class);
    }
}
