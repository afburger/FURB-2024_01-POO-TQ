package com.furb.poo.exercicios.lista02.questao02;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println("Informe o titular da primeira conta:");
        conta1.setTitular(teclado.next());
        
        System.out.println("Informe o número da primeira conta:");
        conta1.setNumero(teclado.next());
        
        System.out.println("Informe o titular da segunda conta:");
        conta2.setTitular(teclado.next());
        
        System.out.println("Informe o número da segunda conta:");
        conta2.setNumero(teclado.next());
        
        // a. Realize depósitos na primeira conta nos valores de R$ 1.000,00 e R$ 700,00.
        conta1.depositar(1000);
        conta1.depositar(700);
        
        // b. Realize depósitos na segunda conta nos valores de R$ 5.000,00.
        conta2.depositar(5000);
        
        // c. Faça um saque na 2ª conta no valor de R$ 3.000,00.
        conta2.sacar(3000);
        
        // d. Transfira R$ 1.800,00 da 2ª conta para a 1ª conta.
        conta2.transferir(conta1, 1800);
        
        System.out.println("Titular: " + conta1.getTitular() + " "
                + "saldo: R$ " + conta1.getSaldo());
        
        System.out.println("Titular: " + conta2.getTitular() + " "
                + "saldo: R$ " + conta2.getSaldo());
    }
    
}
