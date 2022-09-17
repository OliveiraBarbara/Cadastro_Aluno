/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import execoes.ErroDeLeituraException;
import janelas.Aluno;
import java.util.List;

/**
 *
 * @author barbara
 */
public class Carregador {
    
    public static List<Aluno> carregarAluno(LeituraGravacao arq) throws ErroDeLeituraException, ClassNotFoundException {
        return arq.lerDados();
    }

}
