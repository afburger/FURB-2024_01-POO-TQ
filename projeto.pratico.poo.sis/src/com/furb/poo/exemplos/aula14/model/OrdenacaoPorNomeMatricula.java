package com.furb.poo.exemplos.aula14.model;

import java.util.Comparator;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class OrdenacaoPorNomeMatricula implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        int ordem = o1.getNome().compareTo(o2.getNome());
        if (ordem == 0) {
            if (o1.getMatricula() < o2.getMatricula()) {
                ordem = -1;
            } else if (o1.getMatricula() > o2.getMatricula()) {
                ordem = +1;
            } else {
                ordem = 0;
            }
        }

        return ordem;
    }


}
