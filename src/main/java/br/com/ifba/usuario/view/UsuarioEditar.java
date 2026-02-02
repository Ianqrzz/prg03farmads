package br.com.ifba.usuario.view;

import br.com.ifba.usuario.controller.IUsuarioController;
import br.com.ifba.usuario.entity.Usuario;
import javax.swing.JOptionPane;
import java.awt.Frame;

public class UsuarioEditar extends javax.swing.JDialog {

    
    private Usuario usuario;
    private IUsuarioController controller; // CORRETO: Variável é o Controller

    public UsuarioEditar(Frame parent, boolean modal,Usuario usuario, IUsuarioController controller) { // CORRETO: Construtor espera Controller
        super(parent, modal);
        initComponents();
        this.usuario = usuario;
        this.controller = controller;
        this.setLocationRelativeTo(parent);
        preencher();
    }

    private void preencher() {
        if (usuario != null) {
            txtNomeedit.setText(usuario.getLogin()); // CORRETO: Usa txtNomeedit
            txtValoredit.setText(String.valueOf(usuario.getSenha())); // CORRETO: Usa txtValoredit
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

        btnEditarProduto.setText("EditarUsuario");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        lblValoredit.setText("Insira a nova senha do usuario");

        txtNomeedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeeditActionPerformed(evt);
            }
        });

        lblNomeedit.setText("Insira o novo login do usuario");

        lblEditarCurso.setText("EDITANDO USUARIO");

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
            usuario.setLogin(txtNomeedit.getText()); // CORRETO: Usa txtNomeedit
            usuario.setSenha(txtValoredit.getText()); // CORRETO: Usa txtValoredit

            this.controller.update(usuario); // CORRETO: Chama o Controller
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
