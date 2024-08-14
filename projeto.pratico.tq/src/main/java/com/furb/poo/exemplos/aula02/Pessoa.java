package com.furb.poo.exemplos.aula02;

/**
 * Declaração da classes
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {
    
    double altura;
    double peso;
    String nome;
    
    double calcularImc() {
        return peso / (altura * altura);
    }
}
