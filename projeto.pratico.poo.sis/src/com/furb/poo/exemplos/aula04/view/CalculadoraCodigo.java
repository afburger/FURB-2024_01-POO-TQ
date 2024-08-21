package com.furb.poo.exemplos.aula04.view;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
import com.furb.poo.exemplos.aula04.model.Pessoa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculadoraCodigo extends JFrame {
    
    private JTextField nomeField;
    private JTextField pesoField;
    private JTextField alturaField;
    private JLabel resultadoLabel;

    public CalculadoraCodigo() {
        // Configurações do JFrame
        setTitle("Calculadora de IMC");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuração do layout
        setLayout(new GridLayout(5, 2));

        // Campos e labels
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel pesoLabel = new JLabel("Peso (kg):");
        pesoField = new JTextField();

        JLabel alturaLabel = new JLabel("Altura (m):");
        alturaField = new JTextField();

        resultadoLabel = new JLabel("IMC: ");

        // Botão de calcular
        JButton calcularButton = new JButton("Calcular IMC");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });

        // Adiciona os componentes à janela
        add(nomeLabel);
        add(nomeField);
        add(pesoLabel);
        add(pesoField);
        add(alturaLabel);
        add(alturaField);
        add(calcularButton);
        add(resultadoLabel);
    }

    private void calcularIMC() {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(nomeField.getText());

        double peso = Double.parseDouble(pesoField.getText());
        pessoa.setPeso(peso);

        double altura = Double.parseDouble(alturaField.getText());
        pessoa.setAltura(altura);

        double imc = pessoa.calcularImc();

        DecimalFormat df = new DecimalFormat("#,##0.00");
        resultadoLabel.setText("IMC de " + pessoa.getNome() + " é: " + df.format(imc));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraCodigo().setVisible(true);
            }
        });
    }
}

