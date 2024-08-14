package com.furb.poo.exemplos.aula02;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App2 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.peso = 78;
        p1.altura = 1.71;
        
        Pessoa p2 = new Pessoa();
        p2.peso = 68;
        p2.altura = 1.70;
        
        
        Pessoa p3 =  new Pessoa();
        p3.peso = 84;
        p3.altura = 1.79;
        
        p3 = p1;
        
        p3.altura = 1.90;
        
        System.out.println("com.furb.poo.exemplos.aula02.App2.main()");
    }
    
}
