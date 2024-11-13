package com.furb.poo.provas.correcao;
class ItemDesejado extends Item {

    private String recomendacao;

    public ItemDesejado(Filme filme, String recomendacao) throws Exception {
        super(filme);
        if (recomendacao == null) throw new Exception("Valor para o campo recomendação está incorreto");
        this.recomendacao = recomendacao;
    }
    public String getRecomendacao() { return recomendacao; }
}

