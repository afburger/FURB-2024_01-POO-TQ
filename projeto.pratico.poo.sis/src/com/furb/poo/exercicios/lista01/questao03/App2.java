package com.furb.poo.exercicios.lista01.questao03;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App2 {
    
    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        for(int i = 1; i <=3; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe o peso da pessoa " +i + ":");
            pessoa.peso = teclado.nextDouble();
            
            System.out.println("Informe a altura da pessoa " +i + ":");
            pessoa.altura = teclado.nextDouble();
            
            System.out.println("O IMC calculado da pessoa " + i + " é: " +  pessoa.calcularImc());
        }
        
        teclado.close();

    }

}
