package com.furb.poo.exemplos.aula14.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ExemploArrayList {

     public static void main(String[] args) {
        Collection<String> frutas = new ArrayList<>();
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Pêssego");
        frutas.add("Pêra");
        frutas.add("Abacaxi");

        for (String fruta : frutas) {
            if (fruta.startsWith("P")) {
                frutas.remove(fruta);
            }
        }
    }
}
