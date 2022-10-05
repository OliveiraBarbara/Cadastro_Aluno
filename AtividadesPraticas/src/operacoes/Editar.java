/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import alunos.Aluno;
import gui.Cadastro;
import gui.IAtualizarFrame;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author barbara
 */
public class Editar {

    public static void editarAluno(IAtualizarFrame listagem, TreeSet<Aluno> alunos, String id, HashMap<String, TreeSet<String>> estadosCidades) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                new Cadastro(listagem, estadosCidades, aluno);
                break;
            }
        }
    }
}
