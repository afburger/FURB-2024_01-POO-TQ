package com.furb.poo.provas.prova02.model;

import java.util.ArrayList;

/**
 * Representa o catálogo de filmes de uma pessoa.
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Catalogo implements Relatorio {

    private Pessoa pessoa;
    private ArrayList<Item> itens = new ArrayList();

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList getItens() {
        return itens;
    }

    public void setItens(ArrayList itens) {
        this.itens = itens;
    }
    
    public ArrayList<ItemDesejado> getItensDesejados() {
        ArrayList<ItemDesejado> desejados = new ArrayList<>();
        for (Item item : itens) {
            if (item instanceof ItemDesejado) {
                desejados.add((ItemDesejado) item);
            }
        }
        return desejados;
    }
    
    public ArrayList<ItemAssistido> getItensAssistidos() {
        ArrayList<ItemAssistido> assistidos = new ArrayList<>();
        for (Item item : itens) {
            if (item instanceof ItemAssistido) {
                assistidos.add((ItemAssistido) item);
            }
        }
        return assistidos;
    }
    
    public int getQuantidadeItensDesejados() {
        return getItensDesejados().size();
    }
    
    public int getQuantidadeItensAssistidos() {
        return getItensAssistidos().size();
    }
    
//    public int getQuantidadeItenAssistidos() {
//        int qtd = 0;
//        for (Item item : itens) {
//            if (item instanceof ItemAssistido) {
//                qtd++;
//            }
//        }
//        return qtd;
//    }
    
    
    public Filme getFilmeMaiorNota() {
        double nota = 0;
        Filme filme = null;
        for (Item item : itens) {
            if (item instanceof ItemAssistido) {
                ItemAssistido assistido = ((ItemAssistido) item);
                if (assistido.getNota() > nota) {
                    nota = assistido.getNota();
                    filme = assistido.getFilmes().get(0);
                }
            }
        }
        return filme;
    }

    @Override
    public String imprimir() {
        String relatorio = "Pessoa"
                + "\nNome: " + getPessoa().getNome()
                + "\nIdade: " + getPessoa().getIdade()
                + "\ne-mail:" + getPessoa().getEmail()
                + "\n-----------------------------------------"
                + "\nFilmes assistidos: (" + getQuantidadeItensAssistidos() + ")";
        
        for (ItemAssistido assistido : getItensAssistidos()) {
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat(assistido.getInformacaoFilme());
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat("###############################");
        }
        
        relatorio = relatorio.concat("\n-----------------------------------------"+
                "\nFilmes desejados: (" + getQuantidadeItensDesejados()+ ")");
        
        for (ItemDesejado assistido : getItensDesejados()) {
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat(assistido.getInformacaoFilme());
            relatorio = relatorio.concat("\n");
            relatorio = relatorio.concat("###############################");
        }
        
        relatorio = relatorio.concat("\n-----------------------------------------"+
                "\nFilme com a maior nota: " + getFilmeMaiorNota().getNome());
        
        return relatorio;
    }
    
}
