/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import alunos.Aluno;
import java.util.TreeSet;

/**
 *
 * @author barbara
 */
public class Gravador {

    public static void gravarBase(LeituraGravacao arq, TreeSet<Aluno> alunos) {
        arq.gravarAlunos(alunos);
    }

}
