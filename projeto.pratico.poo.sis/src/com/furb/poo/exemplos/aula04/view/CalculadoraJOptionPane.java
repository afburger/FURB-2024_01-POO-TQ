package com.furb.poo.exemplos.aula04.view;

import com.furb.poo.exemplos.aula04.model.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class CalculadoraJOptionPane {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa"));
        pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da pessoa")));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da pessoa")));
        
        JOptionPane.showMessageDialog(null, "O IMC calculado é: " + pessoa.calcularImc());
    }

}
