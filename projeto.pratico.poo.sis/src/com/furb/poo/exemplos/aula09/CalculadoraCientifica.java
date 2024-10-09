package com.furb.poo.exemplos.aula09;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class CalculadoraCientifica extends Calculadora {

    public double raizQuadrada(double num1) {
        setMemoria(999);
        
        return 0.0; 
    }

    
    /**
     * Exemplo de sobrescrita de método
     */
    @Override
    public double somar(double num1, double num2) {
        if (num1 > num2) {
           return super.somar(num1, num2);  
        }
        return super.subtrair(num1, num2); 
    }
    
    
}
