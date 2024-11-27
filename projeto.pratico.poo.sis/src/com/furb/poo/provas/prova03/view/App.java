package com.furb.poo.provas.prova03.view;

import com.furb.poo.provas.prova03.model.MultiplicacaoPorZeroException;
import com.furb.poo.provas.prova03.model.Produto;
import com.furb.poo.provas.prova03.model.ProdutoController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App extends javax.swing.JFrame {

    private ProdutoController controller;
    private List<Produto> produtos;
    
    /**
     * Creates new form App
     */
    public App() {
        try {
            initComponents();
            controller = new ProdutoController();
            
            produtos = controller.carregarDados(controller.FILE_PATH);
            
            for (Produto produto : produtos) {
                taProdutos.append(produto.toString());
                taProdutos.append("\n");
            }
            
        } catch (IOException | NumberFormatException ex) {
            produtos = new ArrayList<>();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnGerenciadorProdutos = new javax.swing.JPanel();
        btIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taProdutos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnGerenciadorProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciador de produtos"));

        btIncluirProduto.setText("Incluir Produto");
        btIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGerenciadorProdutosLayout = new javax.swing.GroupLayout(pnGerenciadorProdutos);
        pnGerenciadorProdutos.setLayout(pnGerenciadorProdutosLayout);
        pnGerenciadorProdutosLayout.setHorizontalGroup(
            pnGerenciadorProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGerenciadorProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIncluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnGerenciadorProdutosLayout.setVerticalGroup(
            pnGerenciadorProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGerenciadorProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIncluirProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taProdutos.setEditable(false);
        taProdutos.setColumns(20);
        taProdutos.setRows(5);
        taProdutos.setEnabled(false);
        jScrollPane1.setViewportView(taProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(pnGerenciadorProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnGerenciadorProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirProdutoActionPerformed
        try {
            ProdutoView produtoView = new ProdutoView(this, true);
            produtoView.setVisible(true);
        
            Produto produto = produtoView.getProduto();

            Double valorTotal = controller.calcularMultiplicacao(produto.getPreco(), produto.getQuantidade());
            
            produto.setValorTotal(valorTotal);
            
            produtos.add(produto);

            taProdutos.append(produto.toString());
            taProdutos.append("\n");
            controller.salvarProdutos(produtos);
            
        } catch (NumberFormatException | IOException | MultiplicacaoPorZeroException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btIncluirProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluirProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnGerenciadorProdutos;
    private javax.swing.JTextArea taProdutos;
    // End of variables declaration//GEN-END:variables
}
