package com.furb.poo.exercicios.lista04.model;

public class Retangulo {

    private int altura;
    private int comprimento;
    
//    private int altura, comprimento;

    /**
     * Contrutor padrão, sem parâmetros.
     */
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
    
    /**
     * Construtor padrão com parâmetros.
     * @param altura a altura do retângulo.
     * @param comprimento o comprimento do retângulo.
     */
    public Retangulo(int altura, int comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    /**
     * Responsável por atribuir uma altura para o retângulo.
     * @param altura a altura informada.
     * @throws caso a altura seja negativa, irá lançar um {@link IllegalArgumentException}
     */
    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }
    
    public int getAltura() {
        return altura;
    }

    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }
    
    public int getComprimento() {
        return comprimento;
    }
    
    /**
     * Efetua o calculo do perímetro do retângulo.
     * @return o perímetro do retângulo.
     */
    public int calcularPerimetro() {
        return (altura * 2) + (comprimento * 2);
    }
    
    /**
     * Efetua o cálculo da área do retângulo.
     * @return a área do retângulo.
     */
    public int calcularArea() {
        return altura * comprimento;
    }
}
