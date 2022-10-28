package exc2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		String idade = JOptionPane.showInputDialog("Digite sua idade");
		Integer id = Integer.valueOf(idade);
		
		JOptionPane.showMessageDialog(null, "O seu nome é " + nome + " e a sua idade é " + id);
	}
}
