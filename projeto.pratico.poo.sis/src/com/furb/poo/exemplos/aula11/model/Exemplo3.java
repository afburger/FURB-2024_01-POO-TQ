package com.furb.poo.exemplos.aula11.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Exemplo3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        while (true) {
            ArrayList<String> erros = new ArrayList<>();
            try {
                num = Integer.parseInt(teclado.nextLine());
                System.out.println("O número informado é: " + num);
                break;
            } catch (NumberFormatException objErro) {
                erros.add(objErro.getMessage());
                System.out.println("Valor incorreto. Por favor, digite novamente");
            }
            
            for (String erro : erros) {
                System.out.println(erro);
            }
        }
    }
}
