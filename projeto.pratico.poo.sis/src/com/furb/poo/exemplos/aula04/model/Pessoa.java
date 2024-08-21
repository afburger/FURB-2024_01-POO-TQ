package com.furb.poo.exemplos.aula04.model;

/**
 * Declaração da classes
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {
    
    double altura;
    double peso;
    String nome;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if  (altura < 0) {
            throw new IllegalArgumentException("Altura não pode ser menor do que zero");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException();
        }
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void copiaDados(Pessoa pessoaDestino) {
        pessoaDestino.setAltura(altura);
        pessoaDestino.setPeso(peso);
    }
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
}
