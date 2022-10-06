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
public class Carregador {

    public static TreeSet<Aluno> carregarBase(LeituraGravacao arq) {
        return arq.lerAlunos();
    }

    public static HashMap<String, TreeSet<String>> carregarEstadosCidades(LeituraGravacao arqv) {
        return arqv.carregarEstadosCidades();
    }
}


/*Para refatorar e criar essa classe pensei nos princípios de Dependency Inversion Principle e Single Responsibility Principle. 
Essa classe foi criada pensando na estabilidade dos módulos que faz parte dela (LeitorGravadorObj) e em conter apenas uma única responsabilidade.

Além da intenção de deixar todas as operações em relação a ler e escrever em arquivo em um único pacote auto explicativo em relação as classes que ele possui.*/
