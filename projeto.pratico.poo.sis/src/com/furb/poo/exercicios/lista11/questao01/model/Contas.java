package com.furb.poo.exercicios.lista11.questao01.model;

import java.util.ArrayList;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Contas {
    
    private ArrayList<Pagavel> contas = new ArrayList<>();
    
    public void incluirConta(Pagavel conta){
       contas.add(conta);
    }
    
    public ArrayList<Pagavel> getContas(){
        return contas;
    }
    
    public double calcularTotalContas(){
      double total = 0;
      
      for(Pagavel p : contas){
         total += p.calcularValorPagar();
      }
            
      return total;
    }
    
}
