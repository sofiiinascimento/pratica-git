package exc1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		
		JOptionPane.showMessageDialog(null, "O seu nome é " + nome);
	}
}
