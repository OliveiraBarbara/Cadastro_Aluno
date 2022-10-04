package alunos;


import java.io.Serializable;
import java.util.TreeSet;
import java.util.UUID;

/**
 *
 * @author barbara
 */
public class Aluno implements Comparable<Aluno>, Serializable {
    
    private String id;
    private String nome;
    private String endereco;
    private String sexo;
    private String cidade;
    private String estado;
    private String observacoes;
    private TreeSet<String> interesses;

    public Aluno(String nome, String endereco, String sexo, String cidade, String estado, String observacoes, TreeSet<String> interesses) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cidade = cidade;
        this.estado = estado;
        this.observacoes = observacoes;
        this.interesses = interesses;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public TreeSet<String> getInteresses() {
        return interesses;
    }
    
    public void addInteresse(String interesse) {
        this.interesses.add(interesse);
    }
    
    public void removeInteresse() {
        this.interesses.clear();
    }
    
    public void removeInteresse(String interesse) {
        this.interesses.remove(interesse);
    }

    @Override
    public int compareTo(Aluno o) {
        return this.id.compareTo(o.getId());
    }
    
    
}
