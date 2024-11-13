package com.furb.poo.exemplos.aula12.model;

import java.io.File;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class AcessoArquivos {

    public static void main(String[] args) {
        File diretorio = new File("C:\\Windows");

        File[] conteudoDiretorio = diretorio.listFiles();
        for (File item : conteudoDiretorio) {
            if (item.isDirectory()) {
                System.out.println("Diretório: " + item.getName());
            } else {
                System.out.println("Arquivo " + item.getName() + " tem " + item.length() + " bytes");
            }
        }
    }
}
