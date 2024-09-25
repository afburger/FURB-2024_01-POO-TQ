package com.furb.poo.exemplos.aula08.model;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ExemploArrayList {

    public static void main(String[] args) {
        ArrayList<Double> iptu = new ArrayList<>();
        iptu.add(145.80); // 0
        iptu.add(250.00); // 1
        iptu.add(7890.00); // 2
        
        System.out.println(iptu.get(1));
        
        for (Double variavelIPTU : iptu) {
            System.out.println(variavelIPTU);
        }
        
        System.out.println("Tamanho array: " + iptu.size());
        
        iptu.remove(145.80);
        System.out.println("Removeu");
        
        for (Double variavelIPTU : iptu) {
            System.out.println(variavelIPTU);
        }
        System.out.println("Tamanho array: " + iptu.size());
        
    }
    
}
