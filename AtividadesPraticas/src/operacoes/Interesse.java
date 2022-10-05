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
    
    public static void RemoveAddInteresse(JList listaInteressesEscolhido, JList listaInteressesDisponiveis, TreeSet<String> interessesDisponives, TreeSet<String> interessesEscolhidos){
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
