package com.furb.poo.exemplos.aula11.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Exemplo4 {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("arquivo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exemplo4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
