package com.furb.poo.provas.prova02.model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Representa uma pessoa que deseja gerenciar seus filmes.
 * 
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Pessoa {

    private String nome;
    private String email;
    private Date dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public int getIdade() {
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(dataNascimento);
        
        Calendar hoje = Calendar.getInstance();
        
        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
        
        return idade;
    }
    
    // Poderia fazer dessa forma também.
//    public int getIdade() {
//        int anoAtual = LocalDate.now().getYear();
//        return anoAtual - dataNascimento.getYear();
//    }
    
}
