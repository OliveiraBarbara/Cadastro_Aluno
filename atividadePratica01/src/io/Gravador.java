/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import execoes.ErroDeGravacaoException;
import janelas.Aluno;
import java.util.List;

/**
 *
 * @author barbara
 */
public class Gravador {   
    
   public static void gravarDados(LeituraGravacao arq, List<Aluno> alunos) throws ErroDeGravacaoException {
        arq.gravarDados(alunos);
    }

}
