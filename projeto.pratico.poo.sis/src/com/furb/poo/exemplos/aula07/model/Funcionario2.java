package com.furb.poo.exemplos.aula07.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario2 {

    private String nome;
    private int ramal;
    private Departamento2 departamentoGerenciado;

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

    public Departamento2 getDepartamentoGerenciado() {
        return departamentoGerenciado;
    }

    public void setDepartamentoGerenciado(Departamento2 departamentoGerenciado) {
        this.departamentoGerenciado = departamentoGerenciado;
    }
    
}
