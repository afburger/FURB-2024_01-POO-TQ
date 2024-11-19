package com.furb.poo.exercicios.lista12.questao01.model;

import java.io.Serializable;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Bairro implements Serializable {
    private String nome;
    private double coeficienteIptu;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
      /*Recusar tentativa de coeficiente seja negativo ou zero*/ 
       if (coeficienteIptu <= 0){
           throw new IllegalArgumentException("O coeficiente de iptu do bairro é inválido. Informe um coeficiente maior que Zero!");
       } 
       
       this.coeficienteIptu = coeficienteIptu;
    }
    
    
}
