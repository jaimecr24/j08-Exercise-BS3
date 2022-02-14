package com.spring.exercisebs3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Clase1 {

    public Clase1(){}

    @PostConstruct
    void Saluda() { System.out.println("Hola desde la clase inicial"); }
}
