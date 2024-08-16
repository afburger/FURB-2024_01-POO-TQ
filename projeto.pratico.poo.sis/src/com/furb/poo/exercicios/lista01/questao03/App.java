package com.furb.poo.exercicios.lista01.questao03;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o peso da pessoa1:");
        pessoa.peso = teclado.nextDouble();
        
        System.out.println("Informe a altura da pessoa1:");
        pessoa.altura = teclado.nextDouble();
        
        System.out.println("O IMC calculado da pessoa 1 é: " +  pessoa.calcularImc());
        
        Pessoa pessoa2 = new Pessoa();  
        
        System.out.println("Informe o peso da pessoa2:");
        pessoa2.peso = teclado.nextDouble();
        
        System.out.println("Informe a altura da pessoa2:");
        pessoa2.altura = teclado.nextDouble();
        
        System.out.println("O IMC calculado da pessoa 2 é: " +  pessoa2.calcularImc());
        
        Pessoa pessoa3 = new Pessoa();  
        
        System.out.println("Informe o peso da pessoa2:");
        pessoa3.peso = teclado.nextDouble();
        
        System.out.println("Informe a altura da pessoa2:");
        pessoa3.altura = teclado.nextDouble();
        
        
        teclado.close();
        
        System.out.println("O IMC calculado da pessoa 3 é: " +  pessoa3.calcularImc());
        
    }

}
