package exc6;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			lista.add(JOptionPane.showInputDialog("Insira algo: "));
		}
		
		JOptionPane.showMessageDialog(null, lista);
	}
}
