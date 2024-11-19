package com.furb.poo.exercicios.lista12.questao02.view;

import com.furb.poo.exercicios.lista12.questao02.model.Teclado;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();
        
        System.out.println("******* CADASTRO DE FUNCIONÁRIOS *****");
        
        System.out.println("Nome: ");
        String nome = teclado.lerString();
        
        System.out.println("Idade: ");
        int idade = teclado.lerInt();
        
        System.out.println("Tem Filhos: ");
        boolean temFilhos = teclado.lerBoolean();
        
        System.out.println("Salário: ");
        double salario = teclado.lerDouble();
        
        System.out.println("************ DADOS INFORMADOS ************");
        System.out.println("   Nome: "+nome);
        System.out.println("   Idade: "+idade);
        System.out.println("   Tem Filhos: "+temFilhos);
        System.out.println("   Salário: "+salario);
          
    }
}
