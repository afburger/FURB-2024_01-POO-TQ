package com.furb.poo.exemplos.aula03;

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
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }
    
}
