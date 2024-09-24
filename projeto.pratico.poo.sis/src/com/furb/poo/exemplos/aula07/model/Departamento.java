package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Departamento {

    private String nome;
    private Funcionario gerente;

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
    
    
    
}
