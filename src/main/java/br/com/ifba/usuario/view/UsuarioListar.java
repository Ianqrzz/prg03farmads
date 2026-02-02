package br.com.ifba.usuario.view;

import br.com.ifba.usuario.controller.IUsuarioController;
import br.com.ifba.usuario.entity.Usuario;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioListar extends javax.swing.JFrame {

    @Autowired
    private IUsuarioController usuarioController;

    private static final Logger logger = Logger.getLogger(UsuarioListar.class.getName());
    private TableRowSorter<DefaultTableModel> sorter;

    public UsuarioListar() {
        initComponents(); // O NetBeans cria a tabela básica aqui (provavelmente errada)

        // --- ADICIONE ESTE BLOCO PARA FORÇAR O MODELO CORRETO ---
        // 1. Recria o modelo com 3 colunas: ID, Nome, Preço
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Login", "Senha"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

            
        });

        // 2. Agora que temos 3 colunas, podemos esconder a coluna 0 (ID)
        esconderColunaID();
        // --------------------------------------------------------

        DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
        sorter = new TableRowSorter<>(model);
        tblProduto.setRowSorter(sorter);

        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);

        adicionarListenerSelecaoTabela();
        adicionarFiltroListener();
    }

    @PostConstruct
    public void aposInicializar() {
        preencherTabela();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPesquisar = new javax.swing.JTextPane();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(20, 51, 72));

        txtPesquisar.setToolTipText("Pesquisar Curso");
        jScrollPane1.setViewportView(txtPesquisar);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Login", "Senha"
            }
        ));
        jScrollPane2.setViewportView(tblProduto);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionar)
                        .addComponent(btnEditar)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // --- NOVO MÉTODO: ESCONDE O ID ---
    private void esconderColunaID() {
        // Coluna 0 é a coluna do ID. Forçamos o tamanho dela a zero.
        tblProduto.getColumnModel().getColumn(0).setMinWidth(0);
        tblProduto.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    private void adicionarListenerSelecaoTabela() {
        // Pega o "modelo de seleção" da tabela e adiciona um "ouvinte" a ele
        tblProduto.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // 'e.getValueIsAdjusting()' evita disparos duplicados (ex: ao arrastar o mouse)
                // Nós só queremos o evento "final" (quando o usuário solta o mouse).
                if (!e.getValueIsAdjusting()) {

                    // Verifica se alguma linha está realmente selecionada
                    // 'getSelectedRow()' retorna -1 se nada estiver selecionado.
                    if (tblProduto.getSelectedRow() != -1) {
                        // Se sim, HABILITA os botões
                        btnEditar.setEnabled(true);
                        btnExcluir.setEnabled(true);
                    } else {
                        // Se não (ex: clicou fora), DESABILITA os botões
                        btnEditar.setEnabled(false);
                        btnExcluir.setEnabled(false);
                    }
                }
            }
        });
    }

    private void preencherTabela() {
        DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
        model.setRowCount(0);

        try {
            List<Usuario> usuarios = this.usuarioController.FindAll();
            if (usuarios != null) {
                for (Usuario p : usuarios) {
                    model.addRow(new Object[]{p.getId(), p.getLogin(), p.getSenha()});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        UsuarioRegistrar telaAdicionar = new UsuarioRegistrar(this.usuarioController);
        telaAdicionar.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selectedRow = tblProduto.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        int modelRow = tblProduto.convertRowIndexToModel(selectedRow);

        // PEGA O ID DA COLUNA 0 (Agora existe!)
        Long id = (Long) tblProduto.getModel().getValueAt(modelRow, 0);

        try {
            Usuario p = this.usuarioController.findById(id);

            UsuarioEditar telaEditar = new UsuarioEditar(this, true, p, this.usuarioController);
            telaEditar.setVisible(true);

            preencherTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = tblProduto.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        int modelRow = tblProduto.convertRowIndexToModel(selectedRow);

        // PEGA O ID DA COLUNA 0
        Long id = (Long) tblProduto.getModel().getValueAt(modelRow, 0);
        String nome = (String) tblProduto.getModel().getValueAt(modelRow, 1);

        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir: " + nome + "?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                this.usuarioController.delete(this.usuarioController.findById(id)); // Chama Controller
                preencherTabela();
                JOptionPane.showMessageDialog(this, "Produto excluído!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void adicionarFiltroListener() {
        txtPesquisar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtrar();
            }
        });
    }

    private void filtrar() {
        String texto = txtPesquisar.getText();
        if (texto.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                // Filtra pelo NOME (Coluna 1)
                // "(?i)" ignora maiúsculas/minúsculas
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 1));
            } catch (Exception e) {
                // Ignora erro de regex
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextPane txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
