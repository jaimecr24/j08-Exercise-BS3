package com.spring.exercisebs3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Clase2 implements CommandLineRunner {

    public Clase2(){}

    @Override
    public void run(String[] args) throws Exception {
        System.out.println("Hola desde la case secundaria");
    }
}
