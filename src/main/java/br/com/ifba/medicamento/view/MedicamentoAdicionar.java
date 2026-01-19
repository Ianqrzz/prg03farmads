package br.com.ifba.medicamento.view;

import br.com.ifba.medicamento.entity.Medicamento;
import br.com.ifba.medicamento.controller.IMedicamentoController;
import javax.swing.JOptionPane;
import java.awt.Frame;

public class MedicamentoAdicionar extends javax.swing.JDialog {

    private IMedicamentoController controller; // CORRETO: Variável é o Controller

    public MedicamentoAdicionar(Frame parent, boolean modal, IMedicamentoController controller) { // CORRETO: Construtor espera Controller
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcriarMedicamento = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnCriar = new javax.swing.JButton();
        lblNome2 = new javax.swing.JLabel();
        txtCusto1 = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JTextField();
        txtQtdEstoque = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        lblNome4 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        lblNome5 = new javax.swing.JLabel();
        txtValidade = new javax.swing.JTextField();
        lblNome6 = new javax.swing.JLabel();
        txtPrincipio = new javax.swing.JTextField();
        lblNome7 = new javax.swing.JLabel();
        txtClassificacao1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblcriarMedicamento.setText("ADICIONANDO MEDICAMENTO");

        lblNome.setText("Insira o nome do medicamento");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblValor.setText("Insira o valor do medicamento");

        btnCriar.setText("Criar Medicamento");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        lblNome2.setText("Insira o custo");

        txtCusto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusto1ActionPerformed(evt);
            }
        });

        lblNome3.setText("Insira o estoque minimo");

        lblNome1.setText("Insira a quantidade em estoque");

        lblNome4.setText("Insira o lote");

        lblNome5.setText("Insira a data de validade do medicamento AAAA-MM-DD");

        txtValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidadeActionPerformed(evt);
            }
        });

        lblNome6.setText("Insira a Classificacao Legal");

        txtPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrincipioActionPerformed(evt);
            }
        });

        lblNome7.setText("Insira o Principio Ativo");

        txtClassificacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassificacao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnCriar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcriarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtValor)
                    .addComponent(txtQtdEstoque)
                    .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCusto1)
                    .addComponent(lblNome4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLote)
                    .addComponent(lblNome5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrincipio)
                    .addComponent(lblNome7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtClassificacao1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcriarMedicamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClassificacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCriar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed

        try {
            Medicamento p = new Medicamento();
            p.setNome(txtNome.getText());

            String precoStr = txtValor.getText().replace(",", ".");
            p.setPreco(Double.parseDouble(precoStr));
            p.setQtdEstoque(Integer.parseInt(txtQtdEstoque.getText()));
            p.setCusto(Double.parseDouble(txtCusto1.getText().replace(",", ".")));
            p.setEstoqueMin(Integer.parseInt(txtEstoqueMin.getText()));
            p.setLote(txtLote.getText());
            p.setClassificacaoLegal(txtPrincipio.getText());

            String dataTexto = txtValidade.getText().replace(" ", "-").replace("/", "-");
            p.setDataValidade(java.time.LocalDate.parse(dataTexto));
            p.setPrincipioAtivo(txtPrincipio.getText());

            this.controller.save(p); // CORRETO: Chama o Controller

            JOptionPane.showMessageDialog(this, "Medicamento salvo!");
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

    private void txtValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValidadeActionPerformed

    private void txtPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrincipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrincipioActionPerformed

    private void txtClassificacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClassificacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClassificacao1ActionPerformed

    public static void main(String args[]) {
        /* Teste */ }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblcriarMedicamento;
    private javax.swing.JTextField txtClassificacao1;
    private javax.swing.JTextField txtCusto1;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrincipio;
    private javax.swing.JTextField txtQtdEstoque;
    private javax.swing.JTextField txtValidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
