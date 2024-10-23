package com.furb.poo.exemplos.aula10.classeabstrata.model;

import java.awt.Color;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Circulo extends Figura {

    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Essa figura é um Círculo");
    }

    
}
