package com.furb.poo.exercicios.lista01.questao02;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o peso da pessoa:");
        pessoa.peso = teclado.nextDouble();
        
        System.out.println("Informe a altura da pessoa:");
        pessoa.altura = teclado.nextDouble();
        
        teclado.close();
        
        System.out.println("O IMC calculado é: " + pessoa.calcularImc());
        
    }

}
