package com.furb.poo.exercicios.lista01.questao04;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
//        Pessoa pessoa1 = new Pessoa();
//        System.out.println("Informe o nome da pessoa 1:");
//        pessoa1.nome = teclado.next();
//        
//        System.out.println("Informe o peso da pessoa 1:");
//        pessoa1.peso = teclado.nextDouble();
//        
//        System.out.println("Informe a altura da pessoa 1:");
//        pessoa1.altura = teclado.nextDouble();
//        
//        Pessoa pessoa2 = new Pessoa();
//        System.out.println("Informe o nome da pessoa 2:");
//        pessoa2.nome = teclado.next();
//        
//        System.out.println("Informe o peso da pessoa 2:");
//        pessoa2.peso = teclado.nextDouble();
//        
//        System.out.println("Informe a altura da pessoa 2:");
//        pessoa2.altura = teclado.nextDouble();
//        
//        Pessoa pessoa3 = new Pessoa();
//        System.out.println("Informe o nome da pessoa 3:");
//        pessoa3.nome = teclado.next();
//        
//        System.out.println("Informe o peso da pessoa 3:");
//        pessoa3.peso = teclado.nextDouble();
//        
//        System.out.println("Informe a altura da pessoa 3:");
//        pessoa3.altura = teclado.nextDouble();
//        
//        
//        System.out.println("Pessoa 3: " + pessoa3.nome + " peso: " + pessoa3.peso 
//                + " altura: " + pessoa3.altura + " IMC: " + pessoa3.calcularImc());
//        
//        System.out.println("Pessoa 2: " + pessoa2.nome + " peso: " + pessoa2.peso 
//                + " altura: " + pessoa2.altura + " IMC: " + pessoa2.calcularImc());
//        
//        System.out.println("Pessoa 1: " + pessoa1.nome + " peso: " + pessoa1.peso 
//                + " altura: " + pessoa1.altura + " IMC: " + pessoa1.calcularImc());
        
        Pessoa[] vetorPessoas = new Pessoa[5];
        
        for (int i = 1; i <= vetorPessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe o nome da pessoa " + i + " :");
            pessoa.nome = teclado.next();
            
            System.out.println("Informe o peso da pessoa " + i + " :");
            pessoa.peso = teclado.nextDouble();
            
            System.out.println("Informe a altura da pessoa " + i + " :");
            pessoa.altura = teclado.nextDouble();
            
            vetorPessoas[i - 1] = pessoa;
        }
        
        for (int i = vetorPessoas.length - 1; i >= 0; i--) {
            Pessoa pessoa = vetorPessoas[i];
            System.out.println("Pessoa "+ (i + 1) +": " + pessoa.nome + " peso: " + pessoa.peso 
                + " altura: " + pessoa.altura + " IMC: " + pessoa.calcularImc());
        }
        teclado.close();
        
    }

}
