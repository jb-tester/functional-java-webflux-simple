package com.mytests.functionalJavaWebFluxSimple;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * *
 * <p>Created by irina on 12/29/2021.</p>
 * <p>Project: functional-java-webflux-simple</p>
 * *
 */
@Service
public class PersonService {

    public Mono<Person> getSinglePerson() {
        return (Mono.just(new Person("vasya", 25)));
    }
}
