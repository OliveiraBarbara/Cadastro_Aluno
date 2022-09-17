/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import janelas.Aluno;
import java.util.List;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vini_
 */
public class FiltroSexo {

    public static DefaultTableModel FiltroSexo(JTable tabelaAlunos, JRadioButton botao, String str, List<Aluno> alunos) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlunos.getModel();
        modelo.setNumRows(0);
        if (!botao.isSelected()) {
            for (Aluno aluno : alunos) {
                if (aluno.getSexo().equals(str)) {
                    String[] tabela = {aluno.getNome(), aluno.getSexo(), aluno.getCidade(), aluno.getEstado()};
                    modelo.addRow(tabela);
                }
            }
        } else {
            modelo.setNumRows(0);
            for (int i = 0; i < alunos.size(); i++) {
                String[] tabela = {alunos.get(i).getNome(), alunos.get(i).getSexo(), alunos.get(i).getCidade(), alunos.get(i).getEstado()};
                modelo.addRow(tabela);
            }
        }
        return modelo;
    }
    
}
