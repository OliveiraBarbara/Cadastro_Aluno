
import alunos.Aluno;
import gui.Listagem;
import io.Carregador;
import io.LeitorGravadorObj;
import java.util.HashMap;
import java.util.TreeSet;


/**
 *
 * @author barbara
 */
public class Principal {

    public static void main(String[] args) {
        TreeSet<Aluno> alunos = Carregador.carregarBase(new LeitorGravadorObj());
        HashMap<String, TreeSet<String>> estadosCidades = Carregador.carregarEstadosCidades(new LeitorGravadorObj());
        
	criarGUI(alunos, estadosCidades);
    }
    
    public static void criarGUI(TreeSet<Aluno> alunos, HashMap<String, TreeSet<String>> estadosCidades) {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Listagem(alunos, estadosCidades).setVisible(true);
	    }
	});
    }
}

/*A intenção foi deixar a classe principal em um pacote contendo apenas ela, além de ter apenas a inicialização das variáveis com as informações dos arquivos e a chamada para iniciar a interface.*/