/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import alunos.Aluno;
import java.util.HashMap;
import java.util.TreeSet;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barbara
 */
public class Carregar {

    public static void carregarDados(JTextField tNome, JRadioButton rFeminino, JRadioButton rMasculino, JTextField tCidade, JComboBox cEstado, JTable tabelaAlunos, TreeSet<Aluno> alunos) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlunos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String nome = tNome.getText().toLowerCase();
        String sexo = rFeminino.isSelected() ? "Feminino" : rMasculino.isSelected() ? "Masculino" : "";
        String cidade = tCidade.getText().toLowerCase();
        String estado = (String) cEstado.getSelectedItem();

        for (Aluno aluno : alunos) {
            if ((nome.isBlank() || aluno.getNome().toLowerCase().contains(nome))
                    && (sexo.isBlank() || aluno.getSexo().contains(sexo))
                    && (cidade.isBlank() || aluno.getCidade().toLowerCase().contains(cidade))
                    && (estado == null || estado.equals("Todos") || aluno.getEstado().contains(estado))) {
                Object[] row = {aluno.getId(), aluno.getNome(), aluno.getSexo(), aluno.getCidade(), aluno.getEstado()};
                modelo.addRow(row);
            }
        }
    }

    public static void carregarCidades(String estado, JComboBox cCidade, HashMap<String, TreeSet<String>> estadosCidades) {
        cCidade.removeAllItems();
        for (String cidade : estadosCidades.get(estado)) {
            cCidade.addItem(cidade);
        }
    }

    public static void carregarEstados(JComboBox cEstado, HashMap<String, TreeSet<String>> estadosCidades) {
        TreeSet<String> estados = new TreeSet<String>(estadosCidades.keySet());

        for (String estado : estados) {
            cEstado.addItem(estado);
        }
    }
    
    public static void carregarDadosAluno(JTextField tNome, JRadioButton rFeminino, JRadioButton rMasculino, JTextField tEndereco, JTextField tObservacoes, JComboBox cCidade, JComboBox cEstado, TreeSet<String> interessesDisponives, TreeSet<String> interessesEscolhidos, JList listaInteressesEscolhido, JList listaInteressesDisponiveis, Aluno aluno) {
        tNome.setText(aluno.getNome());
        tEndereco.setText(aluno.getEndereco());
        tObservacoes.setText(aluno.getObservacoes());

        rFeminino.setSelected(aluno.getSexo().equals("Feminino"));
        rMasculino.setSelected(aluno.getSexo().equals("Masculino"));

        cEstado.setSelectedItem(aluno.getEstado());
        cCidade.setSelectedItem(aluno.getCidade());

        interessesEscolhidos = new TreeSet<String>(aluno.getInteresses());
        interessesDisponives.removeAll(aluno.getInteresses());

        DefaultListModel<String> modelo = new DefaultListModel<String>();
        for (String interesse : interessesEscolhidos) {
            modelo.addElement(interesse);
        }
        listaInteressesEscolhido.setModel(modelo);

        modelo = new DefaultListModel<String>();
        for (String interesse : interessesDisponives) {
            modelo.addElement(interesse);
        }
        listaInteressesDisponiveis.setModel(modelo);
    }
}

/*Para refatorar e criar essa classe pensei no princípio de Single Responsibility Principle. 
Visto que agreguei todos os métodos que estavam em classes diferentes em relação ao carregamento de alguma de informação em uma única classe, 
facilitando modificações futuras e deixando ela com apenas uma responsabilidade em relação ao sistema.

Além da intenção de deixar todas as operações em um único pacote auto explicativo em relação as classes que ele possui.*/
