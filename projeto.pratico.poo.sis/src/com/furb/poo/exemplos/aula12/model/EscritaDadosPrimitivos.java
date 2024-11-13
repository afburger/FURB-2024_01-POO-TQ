package com.furb.poo.exemplos.aula12.model;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class EscritaDadosPrimitivos {
    
    public static void main(String[] args) {
        // Escrita
        try {
            File f = new File("C:\\Temp\\dados.bin");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            Double preco = 1.99;
            dos.writeDouble(preco);
            dos.writeBoolean(true);
            dos.writeUTF("FURB");
            dos.close();
        } catch (IOException e) {
            System.out.println("Erro na Escrita");
        }
    }
}
