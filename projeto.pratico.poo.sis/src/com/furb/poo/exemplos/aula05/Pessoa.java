package com.furb.poo.exemplos.aula05;

/**
 * Declaração da classes
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {

    // Variável membro da classe, pode alterar o valor,
    // Mas possui o mesmo valor para todas as instâncias do objeto.
    public static int contador = 0;
    // Constante não posso mudar o valor.
    public final static int cont = 55;
    
    double altura;
    double peso;
    String nome;

    public Pessoa() {
    }
    
    public Pessoa(double altura, double peso, String nome) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
    }
   
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 3) {
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
    
    public double calcularImc() {
        return calcularImc(altura, peso);
    }
    
    public static double calcularImc(double altura, double peso) {
        return peso / (altura * altura);
    }
}
