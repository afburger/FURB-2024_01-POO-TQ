package com.furb.poo.exercicios.lista01.questao04;

/**
 *
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
