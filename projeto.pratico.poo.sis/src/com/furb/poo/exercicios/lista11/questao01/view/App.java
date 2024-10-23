package com.furb.poo.exercicios.lista11.questao01.view;

import com.furb.poo.exercicios.lista11.questao01.model.ContaAgua;
import com.furb.poo.exercicios.lista11.questao01.model.Contas;
import com.furb.poo.exercicios.lista11.questao01.model.MensalidadeEnsino;
import com.furb.poo.exercicios.lista11.questao01.model.Pagavel;
import com.furb.poo.exercicios.lista11.questao01.model.PrevidenciaPrivada;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    
    public static void main(String[] args) {
        
        Contas minhaConta = new Contas();
                
        PrevidenciaPrivada c1 = new PrevidenciaPrivada();
        c1.setValor(500);
        c1.investir();
        c1.setValor(350);
        c1.investir();
        
        minhaConta.incluirConta(c1);
        
         //R$ 104   
        minhaConta.incluirConta(new ContaAgua(13, 8));   
        //R$ 1400
        minhaConta.incluirConta(new MensalidadeEnsino(7, 200));
        
        System.out.println("Valor Total das Contas: "+
                           minhaConta.calcularTotalContas());
        
        for (Pagavel p : minhaConta.getContas()){
            if (p instanceof PrevidenciaPrivada){
                System.out.println("Valor a Pagar da Conta: "+
                                   p.calcularValorPagar() +
                                   " - Saldo: "+
                                   ((PrevidenciaPrivada)p).getSaldo()); 
                
            
            }else{
            
                System.out.println("Valor a Pagar da Conta: "+
                                p.calcularValorPagar()); 
        
             }
        }
    }
}
