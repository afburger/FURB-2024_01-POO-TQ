package com.furb.poo.exemplos.aula06;


/**
 * Representa uma pessoa para a calculadora de IMC.
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {
    
    // Variável estática ou da classe.
    public static int contador = 0;
    // Constante com o final, não pode ter o seu valor alterado.
    public static final int cont = 12;
    
    private double altura;
    private double peso;
    private String nome;

    /**
     * Construntor padrão.
     */
    public Pessoa() {
    }

    /**
     * Contrutor da pessoa com seus atributos.
     * @param altura a altura da pessoa.
     * @param peso o peso da pessoa.
     * @param nome o nome da pessoa.
     */
    public Pessoa(double altura, double peso, String nome) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
    }

    /**
     * Retorna a altura da pessoa.
     * @return um double que representa a altura da pessoa.
     */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura da pessoa inválida");
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
    
    /**
     * Efetua o calculo do IMC da pessoa.
     * @return o resultado do IMC.
     */
    public double calcularImc() {
        return calcularImc(peso, altura);
    }
    
    public static double calcularImc(double peso, double altura) {
         return peso / (altura * altura);
    }
}
