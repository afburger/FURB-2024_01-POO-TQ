package com.furb.poo.exemplos.aula08.model;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Departamento {

    private String nome;
    private Funcionario gerente;
    private ArrayList<Funcionario> subordinados = new ArrayList<>();;

    public Departamento(Funcionario gerente) {
        setGerente(gerente);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        if (gerente == null) {
            throw new IllegalArgumentException(
                    "Gerente é obrigatório!");
        }
        this.gerente = gerente;
    }

    public void inserirFuncionario(Funcionario funcionario) {
        if (subordinados.size() > 100) {
            throw new RuntimeException("Ultrapassou a quantidade de funcionários");
        }
        this.subordinados.add(funcionario);
    }
    
    public void removeFuncionario(Funcionario funcionario) {
        this.subordinados.remove(funcionario);
    }
    
    public ArrayList<Funcionario> getSubordinados() {
        return subordinados;
    }
    
}
