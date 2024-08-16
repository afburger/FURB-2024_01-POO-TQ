package com.furb.poo.exemplos.aula02;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        
        // Declaração do objeto
        Pessoa variavelPessoa;
        
        // Criação do objeto;
        variavelPessoa = new Pessoa();
        
        // Utilização do objeto.
        variavelPessoa.nome = "andre";
        variavelPessoa.altura = 1.79;
        variavelPessoa.peso = 100;
        
        double imc = variavelPessoa.calcularImc();
        
        System.out.println(imc);
        
    }
}
