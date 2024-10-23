package com.furb.poo.exercicios.lista10.questao01.model;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Retangulo extends Figura {
    
    private int largura;
    private int altura;
    
    public Retangulo (int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return largura * altura;
    }
}
