/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import alunos.Aluno;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author barbara
 */
public class Remover {

    public static void removerAluno(TreeSet<Aluno> alunos, String id, JTextField tNome, JRadioButton rFeminino, JRadioButton rMasculino, JTextField tCidade, JComboBox cEstado, JTable tabelaAlunos) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                alunos.remove(aluno);
                Carregar.carregarDados(tNome, rFeminino, rMasculino, tCidade, cEstado, tabelaAlunos, alunos);
                break;
            }
        }
    }
}

/*Para refatorar e criar essa classe pensei no princípio de Single Responsibility Principle. 
Visto que criei uma classe contendo uma única responsabilidade (remover um aluno da lista) e assim ela cuidará apenas de uma funcionalidade do sistema, 
facilitando caso precise realizar uma modificação futura.
Além da intenção de deixar todas as operações em um único pacote auto explicativo em relação as classes que ele possui.*/