package com.spring.exercisebs3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Clase3 implements CommandLineRunner {

    public Clase3() {}

    @Override
    public void run(String[] args) throws Exception {
        System.out.println("Soy la tercera clase");
        for (String e:args) System.out.println(e);
    }
}
