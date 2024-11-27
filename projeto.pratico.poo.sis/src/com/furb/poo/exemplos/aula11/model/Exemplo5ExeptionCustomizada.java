package com.furb.poo.exemplos.aula11.model;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author andre.burger
 */
public class Exemplo5ExeptionCustomizada {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String nome = teclado.nextLine();
        Aluno aluno = new Aluno();
        try {
            aluno.setNome(nome);
        } catch (ExceptionCustomizada e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
}
