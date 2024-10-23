package com.furb.poo.exemplos.aula10.classeabstrata.model;

import java.awt.Color;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public abstract class Figura {

     private Color cor;
     
     public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
    
    public abstract void desenhar();
    
}
