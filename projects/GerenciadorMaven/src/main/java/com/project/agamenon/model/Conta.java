package com.project.agamenon.model;

import java.math.BigDecimal;

public class Conta {

    // tem : atributos
    public long id;
    public String titular;
    private double saldo;
    public boolean ativa;

    public Conta(long id, String titular) {
        this.id = id;
        this.titular = titular;
        this.saldo = 0.0;
        this.ativa = true;
    }

    // getter and setter
    public double getSaldo() {
        return saldo;
    }

    // faz : métodos
    // depositar
    public boolean depositar(double quantia){
        saldo += quantia;
        return true;
    }

    // sacar
    public boolean sacar(double quantia){
        if ( quantia > saldo )
            return false;

        saldo -= quantia;
        return true;
    }

    // transferencia

}
