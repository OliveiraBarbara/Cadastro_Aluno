/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import alunos.Aluno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Principal;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barbara
 */
public class LeitorGravadorObj implements LeituraGravacao {

    public void gravarAlunos(TreeSet<Aluno> alunos) {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }

        ObjectOutputStream file = null;
        try {
            file = new ObjectOutputStream(new FileOutputStream("./dados/alunos.txt"));
            file.writeObject(alunos);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        System.out.println("Dados gravados com sucesso!!!");
    }

    public TreeSet<Aluno> lerAlunos() {
        TreeSet<Aluno> alunos = new TreeSet<Aluno>();

        File dados = new File("./dados/alunos.txt");
        if (!dados.exists()) {
            return alunos;
        }

        ObjectInputStream file = null;
        try {
            file = new ObjectInputStream(new FileInputStream(dados));
            alunos = (TreeSet<Aluno>) file.readObject();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return alunos;
    }

    public HashMap<String, TreeSet<String>> carregarEstadosCidades() {
        HashMap<String, TreeSet<String>> estadosCidades = new HashMap<String, TreeSet<String>>();

        File dados = new File("./dados/cidades.csv");
        if (!dados.exists()) {
            return estadosCidades;
        }

        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(dados));
            String linha = "";
            while ((linha = file.readLine()) != null) {
                String[] partes = linha.split(";");
                String estado = partes[0];
                String cidade = partes[1];

                if (estadosCidades.containsKey(estado)) {
                    estadosCidades.get(estado).add(cidade);
                } else {
                    TreeSet<String> cidades = new TreeSet<String>();
                    cidades.add(cidade);
                    estadosCidades.put(estado, cidades);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return estadosCidades;
    }
}

/*Para refatorar e criar essa classe pensei no princípio de Single Responsibility Principle. 
Visto que agreguei todos os métodos que estavam em classes diferentes em relação a leitura ou gravação em arquivo em uma única classe, 
facilitando modificações futuras e deixando ela com apenas uma responsabilidade em relação ao sistema.

Além da intenção de deixar todas as operações em relação a ler e escrever em arquivo em um único pacote auto explicativo em relação as classes que ele possui.*/
