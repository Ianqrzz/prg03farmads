package br.com.ifba.medicamento.view;

import br.com.ifba.medicamento.entity.Medicamento;
import br.com.ifba.medicamento.controller.IMedicamentoController;
import javax.swing.JOptionPane;
import java.awt.Frame;

public class MedicamentoEditar extends javax.swing.JDialog {

    private Medicamento medicamento;
    private IMedicamentoController controller; // CORRETO: Variável é o Controller

    public MedicamentoEditar(Frame parent, boolean modal, Medicamento medicamento, IMedicamentoController controller) {
        super(parent, modal);
        initComponents();
        this.medicamento = medicamento; // CORRIGIDO: Era 'this.produto'
        this.controller = controller;
        this.setLocationRelativeTo(parent);
        preencher();
    }

    private void preencher() {
        if (medicamento != null) {
            txtNomeedit.setText(medicamento.getNome());
            txtValoredit.setText(String.valueOf(medicamento.getPreco()));

            txtQtdEstoque.setText(String.valueOf(medicamento.getQtdEstoque()));
            txtEditCusto.setText(String.valueOf(medicamento.getCusto()));
            txtEditEstoqueMin.setText(String.valueOf(medicamento.getEstoqueMin()));
            txtEditLote.setText(medicamento.getLote());
            txtEditClassificacao.setText(medicamento.getClassificacaoLegal());
            // Proteção para data null
            if (medicamento.getDataValidade() != null) {
                txtEditValidade.setText(medicamento.getDataValidade().toString());
            }
            txtEditPrincipio.setText(medicamento.getPrincipioAtivo());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditarMedicamento = new javax.swing.JButton();
        txtValoredit = new javax.swing.JTextField();
        lblValoredit = new javax.swing.JLabel();
        txtNomeedit = new javax.swing.JTextField();
        lblNomeedit = new javax.swing.JLabel();
        lblEditarMedicamento = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        txtQtdEstoque = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();
        txtEditCusto = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        txtEditEstoqueMin = new javax.swing.JTextField();
        lblNome4 = new javax.swing.JLabel();
        txtEditLote = new javax.swing.JTextField();
        lblNome5 = new javax.swing.JLabel();
        txtEditValidade = new javax.swing.JTextField();
        lblNome6 = new javax.swing.JLabel();
        txtEditClassificacao = new javax.swing.JTextField();
        lblNome7 = new javax.swing.JLabel();
        txtEditPrincipio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEditarMedicamento.setText("Editar Medicamento");
        btnEditarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMedicamentoActionPerformed(evt);
            }
        });

        lblValoredit.setText("Insira o novo valor do medicamento");

        txtNomeedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeeditActionPerformed(evt);
            }
        });

        lblNomeedit.setText("Insira o novo nome do medicamento");

        lblEditarMedicamento.setText("EDITANDO MEDICAMENTO");

        lblNome1.setText("Insira a quantidade em estoque");

        lblNome2.setText("Insira o novo custo");

        txtEditCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditCustoActionPerformed(evt);
            }
        });

        lblNome3.setText("Insira o novo estoque minimo");

        lblNome4.setText("Insira o novo lote");

        lblNome5.setText("Insira a nova data de validade do medicamento AAAA-MM-DD");

        txtEditValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditValidadeActionPerformed(evt);
            }
        });

        lblNome6.setText("Insira a nova Classificacao Legal");

        txtEditClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditClassificacaoActionPerformed(evt);
            }
        });

        lblNome7.setText("Insira o novo Principio Ativo");

        txtEditPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditPrincipioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValoredit, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtNomeedit)
                    .addComponent(txtValoredit)
                    .addComponent(txtQtdEstoque)
                    .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEditEstoqueMin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEditCusto)
                    .addComponent(lblNome4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEditLote)
                    .addComponent(lblNome5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEditValidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEditClassificacao)
                    .addComponent(lblNome7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEditPrincipio))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnEditarMedicamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditarMedicamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValoredit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValoredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnEditarMedicamento)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMedicamentoActionPerformed
        try {
            // Campos Básicos
            medicamento.setNome(txtNomeedit.getText());
            medicamento.setPreco(Double.parseDouble(txtValoredit.getText().replace(",", ".")));

            medicamento.setQtdEstoque(Integer.parseInt(txtQtdEstoque.getText()));
            medicamento.setCusto(Double.parseDouble(txtEditCusto.getText().replace(",", ".")));
            medicamento.setEstoqueMin(Integer.parseInt(txtEditEstoqueMin.getText()));

            // Campos Específicos
            medicamento.setLote(txtEditLote.getText());
            medicamento.setClassificacaoLegal(txtEditClassificacao.getText());
            String dataTexto = txtEditValidade.getText().replace(" ", "-").replace("/", "-");
            medicamento.setDataValidade(java.time.LocalDate.parse(dataTexto));
            medicamento.setPrincipioAtivo(txtEditPrincipio.getText());
            // -------------------------------------------------------

            this.controller.update(medicamento);
            JOptionPane.showMessageDialog(this, "Atualizado!");
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Preço inválido!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_btnEditarMedicamentoActionPerformed

    private void txtNomeeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeeditActionPerformed

    private void txtEditCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditCustoActionPerformed

    private void txtEditValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditValidadeActionPerformed

    private void txtEditClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditClassificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditClassificacaoActionPerformed

    private void txtEditPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditPrincipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditPrincipioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarMedicamento;
    private javax.swing.JLabel lblEditarMedicamento;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblNomeedit;
    private javax.swing.JLabel lblValoredit;
    private javax.swing.JTextField txtEditClassificacao;
    private javax.swing.JTextField txtEditCusto;
    private javax.swing.JTextField txtEditEstoqueMin;
    private javax.swing.JTextField txtEditLote;
    private javax.swing.JTextField txtEditPrincipio;
    private javax.swing.JTextField txtEditValidade;
    private javax.swing.JTextField txtNomeedit;
    private javax.swing.JTextField txtQtdEstoque;
    private javax.swing.JTextField txtValoredit;
    // End of variables declaration//GEN-END:variables
}
