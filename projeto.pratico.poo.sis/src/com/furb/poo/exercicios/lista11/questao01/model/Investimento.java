package com.furb.poo.exercicios.lista11.questao01.model;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public abstract class Investimento implements Pagavel {
    
    private double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
