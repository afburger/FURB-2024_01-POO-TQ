package com.furb.poo.exemplos.aula10.interfacee.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaAgua implements Pagavel {

    private double metrosCubicos;
    private final double valorMetro = 2.75;

    public ContaAgua(double metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }
    
    @Override
    public double calcularValorPagar() {
        return metrosCubicos * valorMetro;
    }


    
}
