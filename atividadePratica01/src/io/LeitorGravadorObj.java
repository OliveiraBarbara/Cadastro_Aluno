/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import execoes.ErroDeGravacaoException;
import execoes.ErroDeLeituraException;
import janelas.Aluno;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author barbara
 */
public class LeitorGravadorObj implements LeituraGravacao {
    /*Esté método recebe um Objeto qualquer e uma String path sendo o nome do arquivo, primeiramente é verificado se a pasta
    dados ja existe, caso não existe a mesma é criada, após isso o objeto é gravado dentro da pasta dados no arquivo path*/
    @Override
    public void gravarDados(List<Aluno> alunos) throws ErroDeGravacaoException {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./dados/alunos.txt"));
            out.writeObject(alunos);
        } catch (IOException ex) {
            throw new ErroDeGravacaoException();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                throw new ErroDeGravacaoException();
            }
        }
    }

    @Override
    public List<Aluno> lerDados() throws ErroDeLeituraException, ClassNotFoundException {
        File dados = new File("./dados/alunos.txt");
        if (!dados.exists()) {
            return null;
        }
        ObjectInputStream in = null;
        ArrayList<Aluno> alunos = null;
        try {
            in = new ObjectInputStream(new FileInputStream(dados));
            alunos = (ArrayList<Aluno>) in.readObject();
        } catch (IOException ex) {
            throw new ErroDeLeituraException();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                throw new ErroDeLeituraException();
            }
        }
        return alunos;
    }
}

    