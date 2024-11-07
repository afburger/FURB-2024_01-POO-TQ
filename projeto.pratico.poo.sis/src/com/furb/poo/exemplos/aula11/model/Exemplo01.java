package com.furb.poo.exemplos.aula11.model;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        try {
            idade = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException objErro) {
            System.out.println("Valor incorreto. ");
        }
        System.out.println("Fim");
    }
    
}
