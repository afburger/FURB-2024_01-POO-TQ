package com.furb.poo.exemplos.aula09.revisao;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
    
    public void calcularBonus() {
        System.out.println("O bônus do funcionário é: " + (salario * 0.10));
    }
    
    
}
