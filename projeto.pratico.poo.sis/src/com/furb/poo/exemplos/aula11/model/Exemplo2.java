package com.furb.poo.exemplos.aula11.model;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Exemplo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        while (true) {
            try {
                num = Integer.parseInt(teclado.nextLine());
                System.out.println("O número informado é: " + num);
                break;
            } catch (NumberFormatException objErro) {
                System.out.println("Valor incorreto. Por favor, digite novamente");
            }
        }
    }
}
