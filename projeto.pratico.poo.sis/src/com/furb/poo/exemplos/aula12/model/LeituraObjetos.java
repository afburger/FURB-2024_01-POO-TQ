package com.furb.poo.exemplos.aula12.model;

import com.furb.poo.exemplos.aula12.model.objetos.Aluno;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class LeituraObjetos {

    public static void main(String[] args) {
        try {
            File f = new File("C:\\Temp\\Objetos.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (Exception e) {
            System.out.println("Deu erro");
        }
    }
}
