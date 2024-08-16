package com.furb.poo.exercicios.lista01.questao01;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {
    
    double altura;
    double peso;
    
    double calcularImc() {
        return peso / (altura * altura);
    }
}
