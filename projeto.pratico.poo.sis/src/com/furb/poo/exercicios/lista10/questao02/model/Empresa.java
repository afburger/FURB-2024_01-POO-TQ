package com.furb.poo.exercicios.lista10.questao02.model;

import java.util.ArrayList;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Empresa {
    
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public Empresa(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void incluirFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void removerFuncionario(Funcionario f){
        funcionarios.remove(f);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public double calcularCustosSalarios(){
        double total = 0;
        for(Funcionario f : getFuncionarios()){
            total += f.calcularSalario();
        }
        
        return total;
    }
    
}
