package com.furb.poo.exercicios.lista10.questao01.view;

import com.furb.poo.exercicios.lista10.questao01.model.Circulo;
import com.furb.poo.exercicios.lista10.questao01.model.Figura;
import com.furb.poo.exercicios.lista10.questao01.model.Quadrado;
import com.furb.poo.exercicios.lista10.questao01.model.Retangulo;
import com.furb.poo.exercicios.lista10.questao01.model.Triangulo;
import java.util.Scanner;


/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("****************************************");
        System.out.println(" Escolha a geométrica que deseja criar: ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Triangulo");
        System.out.println("4 - Círculo");
        System.out.println("****************************************");        
        
        int opcao = Integer.parseInt(teclado.nextLine());
        
        Figura figuraGeometrica = null;
        
        switch(opcao){
            case 1: 
                  System.out.println("Informe a medida do Quadrado:");
                  int medida = Integer.parseInt(teclado.nextLine());
                  figuraGeometrica = new Quadrado(medida);
                  
                break;
            case 2: 
                  System.out.println("Informe a largura do Retangulo:");
                  int largura = Integer.parseInt(teclado.nextLine());
                  System.out.println("Informe a altura do Retangulo:");
                  int altura = Integer.parseInt(teclado.nextLine());
                  figuraGeometrica = new Retangulo(largura, altura);
                  
                break;
            case 3: 
                  System.out.println("Informe medida do Lado1 do Triangulo:");
                  int lado1 = Integer.parseInt(teclado.nextLine());
                  System.out.println("Informe medida do Lado2 do Triangulo:");
                  int lado2 = Integer.parseInt(teclado.nextLine());
                  System.out.println("Informe medida do Lado3 do Triangulo:");
                  int lado3 = Integer.parseInt(teclado.nextLine());
                  figuraGeometrica = new Triangulo(lado1, lado2, lado3);
                break;
            case 4: 
                  System.out.println("Informe o raio do Círculo:");
                  int raio = Integer.parseInt(teclado.nextLine());
                  figuraGeometrica = new Circulo(raio);
                  
                break;
            
        }
        
        
        System.out.println("*********************************");
        System.out.println("A area calculada é de: " + figuraGeometrica.calcularArea());
        System.out.println("*********************************");
        
        
                
                
        
    }
 
}
