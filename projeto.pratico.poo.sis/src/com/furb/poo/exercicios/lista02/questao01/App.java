package com.furb.poo.exercicios.lista02.questao01;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        Pessoa[] vetorPessoas = new Pessoa[2];
        
        for (int i = 1; i <= vetorPessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe o nome da pessoa " + i + " :");
            pessoa.setNome(teclado.next());
            
            System.out.println("Informe o peso da pessoa " + i + " :");
            pessoa.setPeso(teclado.nextDouble());
            
            System.out.println("Informe a altura da pessoa " + i + " :");
            pessoa.setAltura(teclado.nextDouble());
            
            vetorPessoas[i - 1] = pessoa;
        }
        
        for (int i = vetorPessoas.length - 1; i >= 0; i--) {
            Pessoa pessoa = vetorPessoas[i];
            System.out.println("Pessoa "+ (i + 1) +": " + pessoa.getNome() + " peso: " + pessoa.getPeso()
                + " altura: " + pessoa.getAltura() + " IMC: " + pessoa.calcularImc());
        }
        teclado.close();
        
    }

}
