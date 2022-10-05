/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import alunos.Aluno;
import java.util.TreeSet;

/**
 *
 * @author barbara
 */
public class Salvar {

    public static Aluno salvarCadastro(String nome, String endereco, String sexo, String cidade, String estado, String observacoes, TreeSet<String> interessesEscolhidos) {
        Aluno aluno = new Aluno(nome, endereco, sexo, cidade, estado, observacoes, interessesEscolhidos);
        if (aluno == null) {
            aluno = new Aluno(nome, endereco, sexo, cidade, estado, observacoes, interessesEscolhidos);
        } else {
            aluno.setNome(nome);
            aluno.setEndereco(endereco);
            aluno.setCidade(cidade);
            aluno.setEstado(estado);
            aluno.setSexo(sexo);
            aluno.setObservacoes(observacoes);
            aluno.removeInteresse();
            for (String interesse : interessesEscolhidos) {
                aluno.addInteresse(interesse);
            }
        }
        return aluno;
    }
}
