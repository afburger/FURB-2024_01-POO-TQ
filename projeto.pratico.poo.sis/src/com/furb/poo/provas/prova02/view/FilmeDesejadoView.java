/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.furb.poo.provas.prova02.view;

import com.furb.poo.provas.prova02.model.Categoria;
import com.furb.poo.provas.prova02.model.Filme;
import com.furb.poo.provas.prova02.model.ItemDesejado;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class FilmeDesejadoView extends javax.swing.JDialog {

    private ItemDesejado item;
    
    /**
     * Creates new form VeiculoView
     */
    public FilmeDesejadoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ItemDesejado getItem() {
        return item;
    }
    
    private void geraErro(String campo) {
        throw new IllegalArgumentException("Valor para o campo " + campo + " está incorreto");
    }
    
    private void validaCampos() {
        if (tfNome.getText() == null) {
            geraErro("Nome");
        }
        
        if (tfAnoLancamento.getText() == null) {
            geraErro("Ano de Lançamento");
        }
        
        if (tfDuracao.getText() == null) {
            geraErro("Duração");
        }
        
        if (cbCategoria.getSelectedItem() == null) {
            geraErro("Categoria");
        }
        
        if (tfIndicacao.getText() == null) {
            geraErro("Indicação");
        }
    }

    private ItemDesejado criaItemDesejado() {
        validaCampos();
        ItemDesejado itemCriado = new ItemDesejado();
        
        Filme filme = new Filme();
        filme.setNome(tfNome.getText());
        filme.setAnoLancamento(Integer.parseInt(tfAnoLancamento.getText()));
        filme.setDuracao(Integer.parseInt(tfDuracao.getText()));
        filme.setCategoria((Categoria) cbCategoria.getSelectedItem());
        
        // Adiciona o novo filme.
        itemCriado.getFilmes().add(filme);
        
        itemCriado.setIndicacao(tfIndicacao.getText());
        
        return itemCriado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnVeiculo = new javax.swing.JPanel();
        lbPlaca = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfAnoLancamento = new javax.swing.JTextField();
        lbKm = new javax.swing.JLabel();
        tfDuracao = new javax.swing.JTextField();
        lbValorDiaria = new javax.swing.JLabel();
        lbValorDiaria1 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        btGerarRelatorio = new javax.swing.JButton();
        lbValorDiaria2 = new javax.swing.JLabel();
        tfIndicacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Filme"));

        lbPlaca.setText("Nome:");

        lbKm.setText("Ano de Lançamento:");

        lbValorDiaria.setText("Duração:");

        lbValorDiaria1.setText("Categoria:");

        cbCategoria.setModel(new DefaultComboBoxModel<Categoria>(Categoria.values()));
        cbCategoria.setSelectedIndex(-1);
        cbCategoria.setSelectedItem(null);

        javax.swing.GroupLayout pnVeiculoLayout = new javax.swing.GroupLayout(pnVeiculo);
        pnVeiculo.setLayout(pnVeiculoLayout);
        pnVeiculoLayout.setHorizontalGroup(
            pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbKm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorDiaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfDuracao)
                    .addComponent(tfAnoLancamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVeiculoLayout.setVerticalGroup(
            pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaca)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKm)
                    .addComponent(tfAnoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorDiaria)
                    .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorDiaria1)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btGerarRelatorio.setText("Gerar relatório");
        btGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarRelatorioActionPerformed(evt);
            }
        });

        lbValorDiaria2.setText("Indicação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(btGerarRelatorio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbValorDiaria2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfIndicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorDiaria2)
                    .addComponent(tfIndicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btConfirmar)
                    .addComponent(btGerarRelatorio))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarRelatorioActionPerformed
        RelatorioView relatorio = new RelatorioView(null, true);
        relatorio.mostraRelatorio("Informações do filme", criaItemDesejado().getFilmes().get(0));
        relatorio.setVisible(true);
    }//GEN-LAST:event_btGerarRelatorioActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        item = criaItemDesejado();
        this.setVisible(false);
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilmeDesejadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmeDesejadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmeDesejadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmeDesejadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FilmeDesejadoView dialog = new FilmeDesejadoView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btGerarRelatorio;
    private javax.swing.JComboBox<Categoria> cbCategoria;
    private javax.swing.JLabel lbKm;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbValorDiaria;
    private javax.swing.JLabel lbValorDiaria1;
    private javax.swing.JLabel lbValorDiaria2;
    private javax.swing.JPanel pnVeiculo;
    private javax.swing.JTextField tfAnoLancamento;
    private javax.swing.JTextField tfDuracao;
    private javax.swing.JTextField tfIndicacao;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
