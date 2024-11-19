package com.furb.poo.exemplos.aula14.model;

import java.util.Comparator;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class OrdenacaoPorNomeDecrescente implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o2.getNome().compareTo(o1.getNome());
    }


}
