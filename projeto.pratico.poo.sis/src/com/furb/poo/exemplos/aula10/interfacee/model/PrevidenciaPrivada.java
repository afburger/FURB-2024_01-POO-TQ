package com.furb.poo.exemplos.aula10.interfacee.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class PrevidenciaPrivada implements Pagavel {

    private double contribuicaoMensal;

    public PrevidenciaPrivada(double contribuicaoMensal) {
        this.contribuicaoMensal = contribuicaoMensal;
    }
    
    @Override
    public double calcularValorPagar() {
        return contribuicaoMensal;
    }

}
