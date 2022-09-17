/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import janelas.Aluno;
import java.util.List;

/**
 *
 * @author Vini_
 */
public class RemoveAluno {

    public static void RemoveAluno(List<Aluno> alunos, String nome) {
        for(int i = 0;i<alunos.size();i++ ){
            if(alunos.get(i).getNome().equals(nome)){
                alunos.remove(i);
            }
        }
    }
    
}
