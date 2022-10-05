package gui;

import alunos.Aluno;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import javax.swing.DefaultListModel;
import operacoes.Carregar;
import operacoes.Interesse;
import operacoes.Salvar;

/**
 *
 * @author barbara
 */
public class Cadastro extends javax.swing.JFrame {

    private IAtualizarFrame listagem;
    private HashMap<String, TreeSet<String>> estadosCidades;
    private Aluno aluno;
    private TreeSet<String> interessesDisponives = new TreeSet<String>();
    private TreeSet<String> interessesEscolhidos = new TreeSet<String>();

    /**
     * Creates new form Cadastro
     */
    public Cadastro(IAtualizarFrame listagem, HashMap<String, TreeSet<String>> estadosCidades, Aluno aluno) {
        this.listagem = listagem;
        this.estadosCidades = estadosCidades;
        this.aluno = aluno;

        initComponents();

        this.cEstado.removeAllItems();
        Carregar.carregarEstados(this.cEstado, this.estadosCidades);

        this.interessesDisponives.add("Redes");
        this.interessesDisponives.add("Internet");
        this.interessesDisponives.add("Segurança");
        this.interessesDisponives.add("Jogos");
        this.interessesDisponives.add("Big Data");
        this.interessesDisponives.add("Inteligência Artificial");
        this.interessesDisponives.add("Qualidade de Software");
        this.interessesDisponives.add("PNL");

        DefaultListModel<String> modelo = new DefaultListModel<String>();
        for (String interesse : this.interessesDisponives) {
            modelo.addElement(interesse);
        }
        this.listaInteressesDisponiveis.setModel(modelo);

        if (this.aluno != null) {
            this.carregarDadosAluno();
        }

        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        rFeminino = new javax.swing.JRadioButton();
        rMasculino = new javax.swing.JRadioButton();
        cEstado = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInteressesEscolhido = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaInteressesDisponiveis = new javax.swing.JList<>();
        bAddInteresse = new javax.swing.JButton();
        bRemoverInteresse = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tObservacoes = new javax.swing.JTextArea();
        bSalvar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        cCidade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de aluno");
        setResizable(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Cidade:");

        jLabel4.setText("Estado:");

        jLabel5.setText("Sexo:");

        bgSexo.add(rFeminino);
        rFeminino.setSelected(true);
        rFeminino.setText("Feminino");

        bgSexo.add(rMasculino);
        rMasculino.setText("Masculino");

        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AM", "AP" }));
        cEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cEstadoItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Interesses"));

        jScrollPane1.setViewportView(listaInteressesEscolhido);

        listaInteressesDisponiveis.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Redes", "Internet", "Desenvolvimento Web", "Segurança", "Compiladores", "Jogos", "Inteligência artificial", "Sistemas de recomendação" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaInteressesDisponiveis);

        bAddInteresse.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        bAddInteresse.setForeground(new java.awt.Color(0, 0, 204));
        bAddInteresse.setText("<<");
        bAddInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddInteresseActionPerformed(evt);
            }
        });

        bRemoverInteresse.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        bRemoverInteresse.setForeground(new java.awt.Color(204, 0, 0));
        bRemoverInteresse.setText(">>");
        bRemoverInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverInteresseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAddInteresse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bRemoverInteresse, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(bAddInteresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bRemoverInteresse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        tObservacoes.setColumns(20);
        tObservacoes.setRows(5);
        jScrollPane3.setViewportView(tObservacoes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        bSalvar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
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

        cCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acrelândia" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEndereco)
                            .addComponent(tNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rMasculino)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rFeminino)
                    .addComponent(rMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvar)
                    .addComponent(bCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRemoverInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverInteresseActionPerformed
        List<String> interesses = this.listaInteressesEscolhido.getSelectedValuesList();
        this.interessesEscolhidos.removeAll(interesses);
        this.interessesDisponives.addAll(new TreeSet<String>(interesses));

        Interesse.RemoveAddInteresse(this.listaInteressesEscolhido, this.listaInteressesDisponiveis, this.interessesDisponives, this.interessesEscolhidos);
    }//GEN-LAST:event_bRemoverInteresseActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAddInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddInteresseActionPerformed
        List<String> interesses = this.listaInteressesDisponiveis.getSelectedValuesList();
        this.interessesDisponives.removeAll(interesses);
        this.interessesEscolhidos.addAll(new TreeSet<String>(interesses));

        Interesse.RemoveAddInteresse(this.listaInteressesEscolhido, this.listaInteressesDisponiveis, this.interessesDisponives, this.interessesEscolhidos);
    }//GEN-LAST:event_bAddInteresseActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        String nome = this.tNome.getText();
        String endereco = this.tEndereco.getText();
        String estado = (String) this.cEstado.getSelectedItem();
        String cidade = (String) this.cCidade.getSelectedItem();
        String sexo = this.rFeminino.isSelected() ? "Feminino" : this.rMasculino.isSelected() ? "Masculino" : "Não informado";
        String observacoes = this.tObservacoes.getText();

        aluno = Salvar.salvarCadastro(nome, endereco, sexo, cidade, estado, observacoes, this.interessesEscolhidos);

        this.listagem.atualizarFrame(aluno);
        this.dispose();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void cEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cEstadoItemStateChanged
        String estado = (String) evt.getItem();
        Carregar.carregarCidades(estado, this.cCidade, this.estadosCidades);
    }//GEN-LAST:event_cEstadoItemStateChanged

    private void carregarDadosAluno() {
        this.tNome.setText(this.aluno.getNome());
        this.tEndereco.setText(this.aluno.getEndereco());
        this.tObservacoes.setText(this.aluno.getObservacoes());

        this.rFeminino.setSelected(this.aluno.getSexo().equals("Feminino"));
        this.rMasculino.setSelected(this.aluno.getSexo().equals("Masculino"));

        this.cEstado.setSelectedItem(this.aluno.getEstado());
        this.cCidade.setSelectedItem(this.aluno.getCidade());

        this.interessesEscolhidos = new TreeSet<String>(this.aluno.getInteresses());
        this.interessesDisponives.removeAll(this.aluno.getInteresses());

        DefaultListModel<String> modelo = new DefaultListModel<String>();
        for (String interesse : this.interessesEscolhidos) {
            modelo.addElement(interesse);
        }
        this.listaInteressesEscolhido.setModel(modelo);

        modelo = new DefaultListModel<String>();
        for (String interesse : this.interessesDisponives) {
            modelo.addElement(interesse);
        }
        this.listaInteressesDisponiveis.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddInteresse;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bRemoverInteresse;
    private javax.swing.JButton bSalvar;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JComboBox<String> cCidade;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaInteressesDisponiveis;
    private javax.swing.JList<String> listaInteressesEscolhido;
    private javax.swing.JRadioButton rFeminino;
    private javax.swing.JRadioButton rMasculino;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextArea tObservacoes;
    // End of variables declaration//GEN-END:variables
}
