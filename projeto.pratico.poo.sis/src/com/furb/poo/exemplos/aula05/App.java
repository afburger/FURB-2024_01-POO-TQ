package com.furb.poo.exemplos.aula05;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        
        // Declaração do objeto
        Pessoa p1;
        
        // Criação do objeto;
        p1 = new Pessoa();
        p1.contador++;
        
        // Utilização do objeto.
        p1.setNome("andre");
        p1.setAltura(2);
        p1.setPeso(10);
        
        double imc = p1.calcularImc();
        
        Pessoa p2;
        
        // Criação do objeto;
        p2 = new Pessoa(1.80, 80, "João");
        p1.contador++;
        
        System.out.println("IMC Pessoa 1 " + imc);
        System.out.println("IMC Pessoa 2 " + p2.calcularImc());
        
        System.out.println("IMC Pessoa XYZ " + Pessoa.calcularImc(1.79, 80));
    }
}
