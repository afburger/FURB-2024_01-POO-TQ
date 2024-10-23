package com.furb.poo.exercicios.lista11.questao01.model;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaAgua implements Pagavel {
    
    private int metrosCubicos;
    private double precoMetroCubico;

    public ContaAgua(int metrosCubicos, double precoMetroCubico) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }

    @Override
    public double calcularValorPagar() {
        return metrosCubicos * precoMetroCubico;
    }
    
}

