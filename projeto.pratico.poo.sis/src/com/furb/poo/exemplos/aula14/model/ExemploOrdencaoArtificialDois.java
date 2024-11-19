package com.furb.poo.exemplos.aula14.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ExemploOrdencaoArtificialDois {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno(1010, "José", "R.XV de Novembro 192", LocalDate.of(2000, 2, 18)));

        alunos.add(new Aluno(6925, "Marta", "R. 7 de setembro, 942", LocalDate.of(2001, 9, 7)));
        
        alunos.add(new Aluno(9999, "José", "R.XV de Novembro 192", LocalDate.of(2000, 2, 18)));

        Collections.sort(alunos, new OrdenacaoPorNomeMatricula());
        
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
