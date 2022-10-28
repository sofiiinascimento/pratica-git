package exc3;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		String precoGasolina = JOptionPane.showInputDialog("Digite o valor da gasolina");
		Double preco = Double.valueOf(precoGasolina);
		
		String litroGasolina = JOptionPane.showInputDialog("Digite a quantidade de litros de gasolina colocados: ");
		Double litros = Double.valueOf(litroGasolina);
		
		Double pagTotal = litros * preco;
		
		JOptionPane.showMessageDialog(null, "O pagamento total foi de "+ pagTotal + " reais");
		
	}
}
