package com.furb.poo.exercicios.lista10.questao02.model;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario {
    
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome, double salarioBase){
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario(){
        return getSalarioBase();
    }
    
    
}
