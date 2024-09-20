package com.furb.poo.provas.prova01.view;

import com.furb.poo.provas.prova01.model.Convenio;
import com.furb.poo.provas.prova01.model.DiariaBicicleta;
import java.text.DecimalFormat;

/**
 * Formulário para o cálculo de locação de bicicleta elétrica.
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ViewUm extends javax.swing.JFrame {

    public ViewUm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfHoras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbCDL = new javax.swing.JCheckBox();
        cbNSC = new javax.swing.JCheckBox();
        cbEstudante = new javax.swing.JCheckBox();
        cbSemConvenio = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quantidade horas:");

        jLabel2.setText("Convênio:");

        cbCDL.setText("CDL");
        cbCDL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCDLItemStateChanged(evt);
            }
        });

        cbNSC.setText("NSC");
        cbNSC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNSCItemStateChanged(evt);
            }
        });

        cbEstudante.setText("Estudante");
        cbEstudante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEstudanteItemStateChanged(evt);
            }
        });

        cbSemConvenio.setText("Sem convênio");
        cbSemConvenio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSemConvenioItemStateChanged(evt);
            }
        });

        jLabel3.setText("Valor total a pagar:");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(cbSemConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(cbEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbNSC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCDL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNSC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEstudante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSemConvenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btCalcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método responsável por chamar a rotina de cálculo.
     * @param evt 
     */
    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        int quantidadeHoras = Integer.parseInt(tfHoras.getText());
        Convenio convenio = null;
        if (cbCDL.isSelected()) {
            convenio = Convenio.CDL;
        } else if (cbNSC.isSelected()) {
            convenio = Convenio.NSC;
        } else if (cbEstudante.isSelected()) {
            convenio = Convenio.ESTUDANTE;
        } else if (cbSemConvenio.isSelected()) {
            convenio = Convenio.SEM_CONVENIO;
        }
        
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        DiariaBicicleta diaria = new DiariaBicicleta(quantidadeHoras, convenio);
        lbValorTotal.setText(df.format(diaria.valorTotalPagar()));
    }//GEN-LAST:event_btCalcularActionPerformed

    private void cbCDLItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCDLItemStateChanged
        cbEstudante.setEnabled(!cbCDL.isSelected());
        cbNSC.setEnabled(!cbCDL.isSelected());
        cbSemConvenio.setEnabled(!cbCDL.isSelected());
    }//GEN-LAST:event_cbCDLItemStateChanged

    private void cbNSCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNSCItemStateChanged
        cbEstudante.setEnabled(!cbNSC.isSelected());
        cbCDL.setEnabled(!cbNSC.isSelected());
        cbSemConvenio.setEnabled(!cbNSC.isSelected());
    }//GEN-LAST:event_cbNSCItemStateChanged

    private void cbEstudanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEstudanteItemStateChanged
        cbNSC.setEnabled(!cbEstudante.isSelected());
        cbCDL.setEnabled(!cbEstudante.isSelected());
        cbSemConvenio.setEnabled(!cbEstudante.isSelected());
    }//GEN-LAST:event_cbEstudanteItemStateChanged

    private void cbSemConvenioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSemConvenioItemStateChanged
        cbNSC.setEnabled(!cbSemConvenio.isSelected());
        cbCDL.setEnabled(!cbSemConvenio.isSelected());
        cbEstudante.setEnabled(!cbSemConvenio.isSelected());
    }//GEN-LAST:event_cbSemConvenioItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JCheckBox cbCDL;
    private javax.swing.JCheckBox cbEstudante;
    private javax.swing.JCheckBox cbNSC;
    private javax.swing.JCheckBox cbSemConvenio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JTextField tfHoras;
    // End of variables declaration//GEN-END:variables
}
