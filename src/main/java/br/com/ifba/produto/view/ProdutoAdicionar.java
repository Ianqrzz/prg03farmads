package br.com.ifba.produto.view;

import br.com.ifba.produto.entity.Produto;
import br.com.ifba.produto.controller.IProdutoController;
import javax.swing.JOptionPane;
import java.awt.Frame;

public class ProdutoAdicionar extends javax.swing.JDialog {

    private IProdutoController controller; // CORRETO: Variável é o Controller

    public ProdutoAdicionar(Frame parent, boolean modal, IProdutoController controller) { // CORRETO: Construtor espera Controller
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcriarProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtQtdEstoque = new javax.swing.JTextField();
        btnCriar = new javax.swing.JButton();
        lblNome1 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        txtCusto1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblcriarProduto.setText("ADICIONANDO PRODUTO");

        lblNome.setText("Insira o nome do produto");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblValor.setText("Insira o valor do produto");

        btnCriar.setText("Criar Produto");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        lblNome1.setText("Insira a quantidade em estoque");

        lblNome2.setText("Insira o custo");

        lblNome3.setText("Insira o estoque minimo");

        txtCusto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcriarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtQtdEstoque)
                    .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCusto1)
                    .addComponent(txtValor1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnCriar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcriarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCusto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCriar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed

        try {
            Produto p = new Produto();
            p.setNome(txtNome.getText());

            p.setPreco(Double.parseDouble(txtValor1.getText().replace(",", ".")));

            p.setQtdEstoque(Integer.parseInt(txtQtdEstoque.getText()));
            p.setCusto(Double.parseDouble(txtCusto1.getText().replace(",", ".")));
            p.setEstoqueMin(Integer.parseInt(txtEstoqueMin.getText()));

            this.controller.save(p);
            JOptionPane.showMessageDialog(this, "Produto salvo!");
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Preço inválido! Digite apenas números.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void txtCusto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusto1ActionPerformed

    public static void main(String args[]) {
        /* Teste */ }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblcriarProduto;
    private javax.swing.JTextField txtCusto1;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdEstoque;
    private javax.swing.JTextField txtValor1;
    // End of variables declaration//GEN-END:variables
}
