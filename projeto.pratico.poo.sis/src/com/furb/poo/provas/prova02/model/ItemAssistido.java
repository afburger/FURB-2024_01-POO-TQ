package com.furb.poo.provas.prova02.model;

import java.util.Date;

/**
 * Representa um item assistido de uma pessoa;
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ItemAssistido extends Item {

    private Date data;
    private String comentario;
    private Double nota;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
}
