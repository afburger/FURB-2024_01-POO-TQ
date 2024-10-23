package com.furb.poo.exemplos.aula10.classeabstrata.model;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class TesteClasseAbstrata {

    public static void main(String[] args) {
        
//        ArrayList<Circulo> circulos = new ArrayList<>();
//        circulos.add(new Circulo());
//        circulos.add(new Triangulo());

          ArrayList<Figura> figuras = new ArrayList<>();
          figuras.add(new Circulo());       // 0
          figuras.add(new Triangulo());     // 1
          figuras.add(new Retangulo());     // 2
          figuras.add(new Pentagono());     // 3
          
          
          Figura figuraTriangulo = figuras.get(2);
          figuraTriangulo.desenhar();
          
          if (figuraTriangulo instanceof Triangulo) {
            Triangulo triangulo = ((Triangulo) figuraTriangulo);

            System.out.println(triangulo.getLado1());
          }
    }
    
}
