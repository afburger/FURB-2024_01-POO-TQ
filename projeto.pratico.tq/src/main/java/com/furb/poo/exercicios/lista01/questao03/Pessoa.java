package com.furb.poo.exercicios.lista01.questao03;

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
