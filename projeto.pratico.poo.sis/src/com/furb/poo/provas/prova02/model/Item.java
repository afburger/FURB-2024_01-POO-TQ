package com.furb.poo.provas.prova02.model;

import java.util.ArrayList;

/**
 * Classe abstrata que representa um item.
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public abstract class Item {

    private ArrayList<Filme> filmes = new ArrayList<>();

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    // Utilizado se cada item possuir apenas um filme.
    public String getInformacaoFilme() {
        String informacao = filmes.get(0).imprimir();
        return informacao;
    }
    
    // Utilizado se cada item possuir mais de um filme.
    public String getInformacaoFilmes() {
        String informacao = "";
        for (Filme filme : filmes) {
            informacao = informacao.concat(filme.imprimir());
        }
        return informacao;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // verifica se os objetos são a mesma instância
        Item item = (Item) obj;
        return filmes.equals(item.filmes); // compara o ArrayList de filmes
    }

}
