package br.com.ifba.produto.view;

import br.com.ifba.produto.entity.Produto;
import br.com.ifba.produto.controller.IProdutoController; // CORRETO: Usa Controller
import javax.swing.JOptionPane;
import java.awt.Frame;

public class ProdutoEditar extends javax.swing.JDialog {

    private Produto produto;
    private IProdutoController controller; // CORRETO: Variável é o Controller

    public ProdutoEditar(Frame parent, boolean modal, Produto produto, IProdutoController controller) { // CORRETO: Construtor espera Controller
        super(parent, modal);
        initComponents();
        this.produto = produto;
        this.controller = controller;
        this.setLocationRelativeTo(parent);
        preencher();
    }

    private void preencher() {
        if (produto != null) {
            txtNomeedit.setText(produto.getNome()); // CORRETO: Usa txtNomeedit
            txtValoredit.setText(String.valueOf(produto.getPreco())); // CORRETO: Usa txtValoredit
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditarProduto = new javax.swing.JButton();
        txtValoredit = new javax.swing.JTextField();
        lblValoredit = new javax.swing.JLabel();
        txtNomeedit = new javax.swing.JTextField();
        lblNomeedit = new javax.swing.JLabel();
        lblEditarCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEditarProduto.setText("Editar Produto");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        lblValoredit.setText("Insira o novo valord do produto");

        txtNomeedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeeditActionPerformed(evt);
            }
        });

        lblNomeedit.setText("Insira o novo nome do produto");

        lblEditarCurso.setText("EDITANDO PRODUTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValoredit, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtNomeedit)
                    .addComponent(txtValoredit))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnEditarProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValoredit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValoredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        try {
            produto.setNome(txtNomeedit.getText()); // CORRETO: Usa txtNomeedit
            produto.setPreco(Double.parseDouble(txtValoredit.getText().replace(",", "."))); // CORRETO: Usa txtValoredit

            this.controller.update(produto); // CORRETO: Chama o Controller
            JOptionPane.showMessageDialog(this, "Atualizado!");
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Preço inválido!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void txtNomeeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeeditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JLabel lblEditarCurso;
    private javax.swing.JLabel lblNomeedit;
    private javax.swing.JLabel lblValoredit;
    private javax.swing.JTextField txtNomeedit;
    private javax.swing.JTextField txtValoredit;
    // End of variables declaration//GEN-END:variables
}
