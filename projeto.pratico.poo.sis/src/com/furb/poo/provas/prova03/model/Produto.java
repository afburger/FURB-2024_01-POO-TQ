package com.furb.poo.provas.prova03.model;

/**
 * Representa um produto 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Produto {

    private String nome;
    private Double preco;
    private int quantidade;
    private Double valorTotal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    // Produto: Gasolina, Preço: 8.29 Quantidade: 45 Valor total: 373.05
    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço: " + getPreco() + " Quntidade: " + getQuantidade() + " Valor total: " + getValorTotal();
    }
    
    // Gasolina,8.29,45,373.05
    public String persistir() {
        return getNome() + "," + getPreco() + "," + getQuantidade() + "," + getValorTotal();
    }
}
