package exc5;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		Integer [] vet = new Integer[10];
		Integer maior = Integer.MIN_VALUE;
		Integer menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < 10; i++) {
			String n = JOptionPane.showInputDialog("Insira um valor");
			Integer num = Integer.valueOf(n);
			vet[i] = num;
			
			if (vet[i] > maior) {
				maior = vet[i];
			}
			
			if (vet[i] < menor) {
				menor = vet[i];
			}
		}
		
		JOptionPane.showMessageDialog(null,"O maior número foi o " + maior + " e menor foi " + menor);
	}
}
