package com.furb.poo.exercicios.lista10.questao01.model;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Circulo extends Figura {
    
   private int raio;
   
   public Circulo(int raio){
       this.raio = raio;
   }
   
   @Override
   public double calcularArea(){
     return Math.PI * Math.pow(raio, 2);
   }
}
