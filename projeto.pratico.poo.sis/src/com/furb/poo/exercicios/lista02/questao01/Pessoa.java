package com.furb.poo.exercicios.lista02.questao01;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {
    
    private double altura;
    private double peso;
    private String nome;
    
    double calcularImc() {
        return peso / (altura * altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
