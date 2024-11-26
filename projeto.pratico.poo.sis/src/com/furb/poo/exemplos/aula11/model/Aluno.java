package com.furb.poo.exemplos.aula11.model;

/**
 *
 * @author andre.burger
 */
public class Aluno {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ExceptionCustomizada {
        if (nome != null && nome.startsWith("A")) {
            throw new ExceptionCustomizada();
        } 
        
        this.nome = nome;
    }
    
}
