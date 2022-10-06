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

/*Para refatorar e criar essa classe pensei no princípio de Single Responsibility Principle. 
Visto que criei uma classe contendo uma única responsabilidade (remover um aluno da lista) e assim ela cuidará apenas de uma funcionalidade do sistema, 
facilitando caso precise realizar uma modificação futura.
Além da intenção de deixar todas as operações em um único pacote auto explicativo em relação as classes que ele possui.*/