package com.furb.poo.exemplos.aula02;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaBancaria {

    private String titular;
    private double saldo;
    
    void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    void depositar(double valor) {
        saldo = saldo + valor;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    
}
