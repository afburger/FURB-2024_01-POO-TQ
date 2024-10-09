package com.furb.poo.exemplos.aula09;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Teste {

    public static void main(String[] args) {
        
        
        CalculadoraCientifica cc = new CalculadoraCientifica();
        System.out.println(cc.somar(3, 4));
        System.out.println(cc.raizQuadrada(0));
        
        
        /*
        Calculadora cc = new CalculadoraCientifica();
        System.out.println(cc.somar(3, 4));
        // Dessa forma vai dar erro de compilação, pois a classe calculadora não possui o método raizQuadrada().
        System.out.println(cc.raizQuadrada(0));
        */
    }
    
}
