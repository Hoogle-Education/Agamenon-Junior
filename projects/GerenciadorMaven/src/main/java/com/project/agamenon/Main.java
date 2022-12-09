package com.project.agamenon;

import com.project.agamenon.model.Conta;

import java.math.BigDecimal;

public class Main {

    static void dizerOla(String nome){
        System.out.println("Ola, " + nome + "!");
    }

    static void dizerOla(){
        System.out.println("Ola!");
    }

    public static void main(String[] args) {

        dizerOla();
        dizerOla("Joao");

        Conta minhConta = new Conta(123123, "Joao da Silva");

    }
}