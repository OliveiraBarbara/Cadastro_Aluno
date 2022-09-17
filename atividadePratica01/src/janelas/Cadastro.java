package janelas;

import execoes.ErroDeGravacaoException;
import io.Gravador;
import io.LeitorGravadorObj;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import operacoes.removeAluno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author barbara
 */
public class Cadastro extends javax.swing.JFrame {

    private List<Aluno> alunos;

    private String[] disciplinas = {"Redes", "Internet", "Desenvolvimento Web", "Segurança", "IA", "Jogos", "Compiladores", "Governça"};
    private ArrayList<String> disciplinasArray = new ArrayList<String>();
    private ArrayList<String> disciVaziaArray = new ArrayList<String>();
    private JTable tabela;
    private String op;

    /**
     * Creates new form cadastro
     *
     * @param alunos
     */
    public Cadastro(List<Aluno> alunos, JTable tabela, String op) {
        initComponents();
        DefaultListModel modelo = new DefaultListModel();
        for (String disciplina : this.disciplinas) {
            modelo.addElement(disciplina);
            disciplinasArray.add(disciplina);
        }
        this.op = op;
        lDisciplinas.setModel(modelo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.alunos = alunos;
        this.tabela = tabela;
        if (op.equals("Editar")) {
            tNome.setText(alunos.get(0).getNome());
            tEndereco.setText(alunos.get(0).getEndereco());
            if (alunos.get(0).getSexo().equals("Feminino")) {
                rFeminino.setSelected(true);
            } else {
                rMasculino.setSelected(true);
            }
            cEstado.getModel().setSelectedItem(alunos.get(0).getEstado());
            DefaultListModel modelo3 = new DefaultListModel();
            DefaultListModel modelo2 = new DefaultListModel();
            for (String disciplina : alunos.get(0).getInteresse()) {
                for (int i = 0; i < this.disciplinasArray.size(); i++) {
                    if (disciplina.equals(this.disciplinasArray.get(i).toString())) {
                        this.disciplinasArray.remove(disciplina);
                    }
                }

            }
            for (String disciplina : this.disciplinasArray) {
                modelo3.addElement(disciplina);
            }
            for (String disciplina : alunos.get(0).getInteresse()) {
                modelo2.addElement(disciplina);
            }
            modelo2.addElement(lDisciplinas.getSelectedValue());
            this.disciVaziaArray.add(lDisciplinas.getSelectedValue());
            lDiscVazia.setModel(modelo2);
            this.lDisciplinas.setModel(modelo3);
            cCidade.getModel().setSelectedItem(alunos.get(0).getCidade());
            tObservacao.setText(alunos.get(0).getObservacao());
        }
    }

    public static void AtualizaAluno(Aluno aluno, List<Aluno> alunos, JTable tabela) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGSexo = new javax.swing.ButtonGroup();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lEndereco = new javax.swing.JLabel();
        tEndereco = new javax.swing.JTextField();
        lEstado = new javax.swing.JLabel();
        cEstado = new javax.swing.JComboBox<>();
        lCidade = new javax.swing.JLabel();
        cCidade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        rFeminino = new javax.swing.JRadioButton();
        rMasculino = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        bMenor = new javax.swing.JButton();
        bMaior1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lDisciplinas = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lDiscVazia = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tObservacao = new javax.swing.JTextArea();
        bSalvar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Aluno");
        setResizable(false);

        lNome.setText("Nome:");

        lEndereco.setText("Endereço:");

        lEstado.setText("Estado:");

        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lCidade.setText("Cidade:");

        cCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Sexo:");

        bGSexo.add(rFeminino);
        rFeminino.setText("Feminino");

        bGSexo.add(rMasculino);
        rMasculino.setText("Masculino");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Interesses"));

        bMenor.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bMenor.setForeground(new java.awt.Color(255, 0, 0));
        bMenor.setText("<<");
        bMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenorActionPerformed(evt);
            }
        });

        bMaior1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bMaior1.setForeground(new java.awt.Color(0, 0, 153));
        bMaior1.setText(">>");
        bMaior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaior1ActionPerformed(evt);
            }
        });

        lDisciplinas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Redes", "Internet", "Desenvolvimento Web", "Segurança", "IA", "Jogos", "Compiladores", "Governça" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lDisciplinas);

        jScrollPane4.setViewportView(lDiscVazia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bMenor)
                    .addComponent(bMaior1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bMaior1)
                .addGap(18, 18, 18)
                .addComponent(bMenor)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        tObservacao.setColumns(20);
        tObservacao.setRows(5);
        jScrollPane1.setViewportView(tObservacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lEstado)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rFeminino)
                                .addGap(18, 18, 18)
                                .addComponent(rMasculino)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cCidade, 0, 196, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lEndereco)
                            .addComponent(lNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNome)
                            .addComponent(tEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSalvar))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEndereco)
                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEstado)
                    .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCidade)
                    .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rFeminino)
                    .addComponent(rMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvar)
                    .addComponent(bCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMaior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaior1ActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        DefaultListModel modelo2 = new DefaultListModel();
        for (String disciplina : this.disciplinas) {
            if (disciplina == this.lDiscVazia.getSelectedValue()) {
                this.disciVaziaArray.remove(disciplina);
            }
        }
        for (String disciplina : this.disciVaziaArray) {
            modelo2.addElement(disciplina);
        }
        if (this.disciplinasArray.size() != 0) {
            for (String disciplina : this.disciplinasArray) {
                modelo.addElement(disciplina);
            }
        }
        modelo.addElement(lDiscVazia.getSelectedValue());
        this.disciplinasArray.add(lDiscVazia.getSelectedValue());
        lDisciplinas.setModel(modelo);
        this.lDiscVazia.setModel(modelo2);
    }//GEN-LAST:event_bMaior1ActionPerformed

    private void bMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenorActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        DefaultListModel modelo2 = new DefaultListModel();
        for (String disciplina : this.disciplinas) {
            if (disciplina == this.lDisciplinas.getSelectedValue()) {
                this.disciplinasArray.remove(disciplina);
            }
        }
        for (String disciplina : this.disciplinasArray) {
            modelo.addElement(disciplina);
        }
        if (this.disciVaziaArray.size() != 0) {
            for (String disciplina : this.disciVaziaArray) {
                modelo2.addElement(disciplina);
            }
        }
        modelo2.addElement(lDisciplinas.getSelectedValue());
        this.disciVaziaArray.add(lDisciplinas.getSelectedValue());
        lDiscVazia.setModel(modelo2);
        this.lDisciplinas.setModel(modelo);
    }//GEN-LAST:event_bMenorActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        String sexo = "";
        if (op.equals("Editar")) {
            removeAluno.RemoveAluno(alunos, tNome.getText());
        }
        if (rFeminino.isSelected()) {
            sexo = "Feminino";
        } else if (rMasculino.isSelected()) {
            sexo = "Masculino";
        }

        Aluno aluno = new Aluno(tNome.getText(), tEndereco.getText(), cEstado.getSelectedItem().toString(), cCidade.getSelectedItem().toString(), sexo, this.disciVaziaArray, tObservacao.getText());
        alunos.add(aluno);
        String[] modtab = {tNome.getText(), sexo, cCidade.getSelectedItem().toString(), cEstado.getSelectedItem().toString()};
        modelo.addRow(modtab);
        this.tabela.setModel(modelo);
        try {
            Gravador.gravarDados(new LeitorGravadorObj(), alunos);
        } catch (ErroDeGravacaoException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.ButtonGroup bGSexo;
    private javax.swing.JButton bMaior1;
    private javax.swing.JButton bMenor;
    private javax.swing.JButton bSalvar;
    private javax.swing.JComboBox<String> cCidade;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lCidade;
    private javax.swing.JList<String> lDiscVazia;
    private javax.swing.JList<String> lDisciplinas;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lNome;
    private javax.swing.JRadioButton rFeminino;
    private javax.swing.JRadioButton rMasculino;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextArea tObservacao;
    // End of variables declaration//GEN-END:variables
}
