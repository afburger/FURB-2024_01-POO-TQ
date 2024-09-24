package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Departamento2 {

    private String nome;
    private Funcionario2 gerente;

    public Departamento2(Funcionario2 gerente) {
        setGerente(gerente);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario2 getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario2 gerente) {
        if (gerente == null) {
            throw new IllegalArgumentException(
                    "Gerente é obrigatório!");
        }
        this.gerente = gerente;
    }
    
    
    
}
