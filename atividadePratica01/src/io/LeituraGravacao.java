/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import execoes.ErroDeGravacaoException;
import execoes.ErroDeLeituraException;
import janelas.Aluno;
import java.util.List;

/**
 *
 * @author barbara
 */
public interface LeituraGravacao {
   public abstract void gravarDados(List<Aluno> alunos) throws ErroDeGravacaoException; 
   
   public abstract List<Aluno> lerDados() throws ErroDeLeituraException, ClassNotFoundException;
   
}
