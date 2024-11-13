package com.furb.poo.exemplos.aula12.model;

import com.furb.poo.exemplos.aula12.model.objetos.Aluno;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class EscritaObjetos {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(1010);
        aluno.setNome("Nome do aluno");
        aluno.setNotaEnem(10.0);
        
        
        try {
            File f = new File("C:\\Temp\\Objetos.bin");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream o = new ObjectOutputStream(fos);
            o.writeObject(aluno);
        } catch (IOException e) {
        }
        
    }
}
