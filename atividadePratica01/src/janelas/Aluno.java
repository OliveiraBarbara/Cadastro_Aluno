package janelas;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barbara
 */
public class Aluno implements Serializable{
    
    private String nome;
    private String endereco;
    private String estado;
    private String cidade;
    private String sexo;
    private ArrayList<String> disciplinas = new ArrayList<String>();
    private String observacao;

    public Aluno(String nome, String endereco, String estado, String cidade, String sexo, ArrayList<String> disciplinas, String observacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.sexo = sexo;
        this.disciplinas = disciplinas;
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public ArrayList<String> getInteresse() {
        return disciplinas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setInteresse(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", endereco=" + endereco + ", estado=" + estado + ", cidade=" + cidade + ", sexo=" + sexo + ", interesse=" + disciplinas + ", observacao=" + observacao + '}';
    }
    
}
