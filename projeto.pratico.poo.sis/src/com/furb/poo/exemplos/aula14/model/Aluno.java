package com.furb.poo.exemplos.aula14.model;

import java.time.LocalDate;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Aluno implements Comparable<Aluno> {

    private int matricula;
    private String nome;
    private String endereco;
    private LocalDate dataNascimento;

    public Aluno(int matricula, String nome, String endereco, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Aluno o) {
        if (this.matricula < o.matricula)
            return -1;
        if (this.matricula > o.matricula)
            return +1;
        return 0;

//        return this.nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "Matrículo: " + getMatricula() + " Nome: " + getNome() + " Endereço: " + getEndereco() 
                + " Nascimento: " + getDataNascimento().getDayOfMonth() + "/" + getDataNascimento().getMonthValue() +"/" + getDataNascimento().getYear();
    }
    
}
