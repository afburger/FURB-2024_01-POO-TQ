package com.furb.poo.exercicios.lista04.view;

import com.furb.poo.exercicios.lista04.model.Retangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class AppQuestao2Ui {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retângulo:")));
        retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento do retângulo:")));
        
        JOptionPane.showMessageDialog(null, "Perímetro: " + retangulo.calcularPerimetro() + "\n"
                + "Área: " + retangulo.calcularArea());
    }
    
}
