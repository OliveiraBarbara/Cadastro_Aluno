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

/*Essa interface foi criada pensando no conceito Interface Segregation Principle.
Sendo que essa interface implementa apenas métodos relacionados a ler e gravar de arquivo.

Além da intenção de deixar todas as operações em relação a ler e escrever em arquivo em um único pacote auto explicativo em relação as classes que ele possui.*/
