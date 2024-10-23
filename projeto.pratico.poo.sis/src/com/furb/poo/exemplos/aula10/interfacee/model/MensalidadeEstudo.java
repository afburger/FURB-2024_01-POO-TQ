package com.furb.poo.exemplos.aula10.interfacee.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class MensalidadeEstudo implements Pagavel {

    private double valorMensalidade;

    public MensalidadeEstudo(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
    
    @Override
    public double calcularValorPagar() {
        return valorMensalidade;
    }

}
