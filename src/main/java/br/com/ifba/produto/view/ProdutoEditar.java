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
            txtEditQtdEstoque1.setText(String.valueOf(produto.getQtdEstoque()));
            txtEditCusto.setText(String.valueOf(produto.getCusto()));
            txtEditEstoqueMin.setText(String.valueOf(produto.getEstoqueMin()));
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
        lblValoredit1 = new javax.swing.JLabel();
        txtEditCusto = new javax.swing.JTextField();
        lblValoredit2 = new javax.swing.JLabel();
        txtEditQtdEstoque1 = new javax.swing.JTextField();
        lblValoredit3 = new javax.swing.JLabel();
        txtEditEstoqueMin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEditarProduto.setText("Editar Produto");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        lblValoredit.setText("Insira o novo valor do produto");

        txtNomeedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeeditActionPerformed(evt);
            }
        });

        lblNomeedit.setText("Insira o novo nome do produto");

        lblEditarCurso.setText("EDITANDO PRODUTO");

        lblValoredit1.setText("Insira a nova quantidade em estoque");

        lblValoredit2.setText("Insira o novo custo");

        lblValoredit3.setText("Insira o novo estoque minimo");

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
                    .addComponent(txtValoredit)
                    .addComponent(lblValoredit1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtEditCusto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValoredit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtEditQtdEstoque1)
                    .addComponent(lblValoredit3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtEditEstoqueMin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarProduto)
                .addGap(143, 143, 143))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValoredit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditQtdEstoque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValoredit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValoredit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarProduto)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        try {
            // 1. Atualiza Nome
            produto.setNome(txtNomeedit.getText());

            // 2. Atualiza Preço (troca vírgula por ponto)
            produto.setPreco(Double.parseDouble(txtValoredit.getText().replace(",", ".")));

            // --- IMPORTANTE: AS LINHAS ABAIXO ESTAVAM FALTANDO ---
            // 3. Atualiza Quantidade em Estoque (txtEditQtdEstoque1 é o nome da variável na sua tela)
            produto.setQtdEstoque(Integer.parseInt(txtEditQtdEstoque1.getText()));

            // 4. Atualiza Custo
            produto.setCusto(Double.parseDouble(txtEditCusto.getText().replace(",", ".")));

            // 5. Atualiza Estoque Mínimo
            produto.setEstoqueMin(Integer.parseInt(txtEditEstoqueMin.getText()));

            // -----------------------------------------------------
            // Chama o controller para salvar no banco
            this.controller.update(produto);

            JOptionPane.showMessageDialog(this, "Produto Atualizado com Sucesso!");
            this.dispose(); // Fecha a janela

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique os números! Não use letras em campos de valor.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + e.getMessage());
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
    private javax.swing.JLabel lblValoredit1;
    private javax.swing.JLabel lblValoredit2;
    private javax.swing.JLabel lblValoredit3;
    private javax.swing.JTextField txtEditCusto;
    private javax.swing.JTextField txtEditEstoqueMin;
    private javax.swing.JTextField txtEditQtdEstoque1;
    private javax.swing.JTextField txtNomeedit;
    private javax.swing.JTextField txtValoredit;
    // End of variables declaration//GEN-END:variables
}
