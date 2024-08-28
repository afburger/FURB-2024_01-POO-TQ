package com.furb.poo.exercicios.lista04.view;

import com.furb.poo.exercicios.lista04.model.Retangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class AppQuestao3Ui {

    public static void main(String[] args) {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retângulo:"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento do retângulo:"));
       
        Retangulo retangulo = new Retangulo(altura, comprimento);
        
        JOptionPane.showMessageDialog(null, "Perímetro: " + retangulo.calcularPerimetro() + "\n"
                + "Área: " + retangulo.calcularArea());
    }
    
}
