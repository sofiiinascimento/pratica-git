package exc4;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			String num = JOptionPane.showInputDialog("Digite um valor");
			Integer n = Integer.valueOf(num);
			
			JOptionPane.showMessageDialog(null,"O valor digitado foi: " + n);
		}
	}
}
