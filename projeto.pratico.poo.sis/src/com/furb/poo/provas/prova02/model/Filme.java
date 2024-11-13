package com.furb.poo.provas.prova02.model;

/**
 * Representa um filme.
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Filme implements Relatorio {

    private String nome;
    private int anoLancamento;
    private int duracao;
    private Categoria categoria;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filme other = (Filme) obj;
        return this.nome.equals(other.nome);
    }

    @Override
    public String imprimir() {
        String relatorio = "Nome: " + getNome()
                + "\nAno de lançamento: " + getAnoLancamento()
                + "\nCategoria:" + getCategoria()
                + "\nDuração: " + getDuracao() + " minutos";
        return relatorio;
    }

}
