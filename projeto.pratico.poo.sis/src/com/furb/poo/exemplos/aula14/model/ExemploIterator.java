package com.furb.poo.exemplos.aula14.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ExemploIterator {

    public static void main(String[] args) {
        Collection<String> frutas = new ArrayList<>();
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Pêssego");
        frutas.add("Pêra");
        frutas.add("Abacaxi");

        
        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()) {
            String fruta = iterator.next();
            if (fruta.startsWith("P")) {
                iterator.remove();
            }
        }
        
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
    
}
