package com.furb.poo.exemplos.aula10.interfacee.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaLuz implements Pagavel {

    private double kwConsumidos;
    private final double kwHora = 7.35;

    public ContaLuz(double kwConsumidos) {
        this.kwConsumidos = kwConsumidos;
    }

    @Override
    public double calcularValorPagar() {
        return kwConsumidos * kwHora;
    }

}
