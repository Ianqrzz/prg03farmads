package br.com.ifba.medicamento.view;

import br.com.ifba.medicamento.entity.Medicamento;
import br.com.ifba.medicamento.controller.IMedicamentoController;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
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
public class MedicamentoListar extends javax.swing.JFrame {

    @Autowired
    private IMedicamentoController produtoController;

    private static final Logger logger = Logger.getLogger(MedicamentoListar.class.getName());
    private TableRowSorter<DefaultTableModel> sorter;

    public MedicamentoListar() {
        initComponents();

        tblMedicamento.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Nome", "Preço", "Qtd", "Custo", "Mínimo", "Lote", "Validade", "Classificação", "Principio Ativo"
                }
        ) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        // 2. Agora que temos 3 colunas, podemos esconder a coluna 0 (ID)
        esconderColunaID();
        // --------------------------------------------------------

        DefaultTableModel model = (DefaultTableModel) tblMedicamento.getModel();
        sorter = new TableRowSorter<>(model);
        tblMedicamento.setRowSorter(sorter);

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
        tblMedicamento = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(20, 51, 72));

        txtPesquisar.setToolTipText("Pesquisar Curso");
        jScrollPane1.setViewportView(txtPesquisar);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tblMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Valor", "Estoque", "Custo", "Estoque Minimo", "Lote", "Validade", "Classificacao Legal", "Principio Ativo"
            }
        ));
        jScrollPane2.setViewportView(tblMedicamento);

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // --- NOVO MÉTODO: ESCONDE O ID ---
    private void esconderColunaID() {
        // Coluna 0 é a coluna do ID. Forçamos o tamanho dela a zero.
        tblMedicamento.getColumnModel().getColumn(0).setMinWidth(0);
        tblMedicamento.getColumnModel().getColumn(0).setMaxWidth(0);
        tblMedicamento.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    private void adicionarListenerSelecaoTabela() {
        // Pega o "modelo de seleção" da tabela e adiciona um "ouvinte" a ele
        tblMedicamento.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // 'e.getValueIsAdjusting()' evita disparos duplicados (ex: ao arrastar o mouse)
                // Nós só queremos o evento "final" (quando o usuário solta o mouse).
                if (!e.getValueIsAdjusting()) {

                    // Verifica se alguma linha está realmente selecionada
                    // 'getSelectedRow()' retorna -1 se nada estiver selecionado.
                    if (tblMedicamento.getSelectedRow() != -1) {
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
        DefaultTableModel model = (DefaultTableModel) tblMedicamento.getModel();
        model.setRowCount(0);

        try {
            List<Medicamento> produtos = this.produtoController.findAll();
            if (produtos != null) {
                for (Medicamento p : produtos) {
                    model.addRow(new Object[]{
                        p.getId(),
                        p.getNome(),
                        p.getPreco(),
                        p.getQtdEstoque(), 
                        p.getCusto(), 
                        p.getEstoqueMin(), 
                        p.getLote(), 
                        p.getDataValidade(),
                        p.getClassificacaoLegal(), 
                        p.getPrincipioAtivo()
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        MedicamentoAdicionar telaAdicionar = new MedicamentoAdicionar(this, true, this.produtoController);
        telaAdicionar.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selectedRow = tblMedicamento.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        int modelRow = tblMedicamento.convertRowIndexToModel(selectedRow);

        // PEGA O ID DA COLUNA 0 (Agora existe!)
        Long id = (Long) tblMedicamento.getModel().getValueAt(modelRow, 0);

        try {
            Medicamento p = this.produtoController.findById(id);

            MedicamentoEditar telaEditar = new MedicamentoEditar(this, true, p, this.produtoController);
            telaEditar.setVisible(true);

            preencherTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = tblMedicamento.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        int modelRow = tblMedicamento.convertRowIndexToModel(selectedRow);
        Long id = (Long) tblMedicamento.getModel().getValueAt(modelRow, 0); // Pega o ID
        String nome = (String) tblMedicamento.getModel().getValueAt(modelRow, 1);

        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir: " + nome + "?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
      
                Medicamento medParaDeletar = this.produtoController.findById(id);
                this.produtoController.delete(medParaDeletar);

                preencherTabela();
                JOptionPane.showMessageDialog(this, "Medicamento excluído!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void adicionarFiltroListener() {
        txtPesquisar.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                filtrar();
            }

            public void removeUpdate(DocumentEvent e) {
                filtrar();
            }

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new MedicamentoListar().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMedicamento;
    private javax.swing.JTextPane txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
