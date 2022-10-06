/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.TreeSet;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author barbara
 */
public class Interesse {

    public static void removeAddInteresse(JList listaInteressesEscolhido, JList listaInteressesDisponiveis, TreeSet<String> interessesDisponives, TreeSet<String> interessesEscolhidos) {
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        for (String interesse : interessesEscolhidos) {
            modelo.addElement(interesse);
        }
        listaInteressesEscolhido.setModel(modelo);

        modelo = new DefaultListModel<String>();
        for (String interesse : interessesDisponives) {
            modelo.addElement(interesse);
        }
        listaInteressesDisponiveis.setModel(modelo);
    }
}

/*Para refatorar e criar essa classe pensei no princípio de Single Responsibility Principle. 
Visto que criei uma classe contendo uma única responsabilidade (remover um aluno da lista) e assim ela cuidará apenas de uma funcionalidade do sistema, 
facilitando caso precise realizar uma modificação futura, além de diminuir a repetição do código.
Além da intenção de deixar todas as operações em um único pacote auto explicativo em relação as classes que ele possui.*/
