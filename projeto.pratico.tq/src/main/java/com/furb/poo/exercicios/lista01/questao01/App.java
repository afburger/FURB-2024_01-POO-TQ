package com.furb.poo.exercicios.lista01.questao01;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    
    public static void main(String[] args) {
        
        Pessoa marta;
        marta = new Pessoa();
        
        marta.altura = 1.75;
        marta.peso = 78;
        
        System.out.println("O IMC calculado é: " + marta.calcularImc());
        
    }

}
