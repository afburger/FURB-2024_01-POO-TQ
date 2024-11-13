package com.furb.poo.exemplos.aula12.model;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class LeituraDadosPrimitivos {

    public static void main(String[] args) {
        // Leitura
        try {
            File fileRead = new File("C:\\Temp\\dados.bin");
            FileInputStream fis = new FileInputStream(fileRead);
            DataInputStream dis = new DataInputStream(fis);
            double precoLido = dis.readDouble();
            boolean bool = dis.readBoolean();
            String instituicao = dis.readUTF();
            dis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException ex) {
            System.out.println("Leitura de dados inválida");
        }
    }
    
}
