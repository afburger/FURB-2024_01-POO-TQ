package com.furb.poo.exercicios.lista11.questao01.model;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class PrevidenciaPrivada extends Investimento {
    
    private double valor;
    
    @Override
    public double calcularValorPagar() {
        return valor;
    }
    
    public void setValor(double valor){
       this.valor = valor; 
    }
    
    public void investir(){
        setSaldo( getSaldo() + valor);
    }
    
}
