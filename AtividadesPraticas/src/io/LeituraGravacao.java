/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import alunos.Aluno;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author barbara
 */
public interface LeituraGravacao {
    
    public abstract void gravarAlunos(TreeSet<Aluno> alunos);
    
    public abstract TreeSet<Aluno> lerAlunos();
    
    public abstract HashMap<String, TreeSet<String>> carregarEstadosCidades();
    
}
