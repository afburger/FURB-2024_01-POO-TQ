package com.furb.poo.exemplos.aula08.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario {

    private String nome;
    private int ramal;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
}
