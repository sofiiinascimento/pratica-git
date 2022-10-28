package exc7;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		String aluno = JOptionPane.showInputDialog("Insira o nome do aluno/a: ");
		String n1 = JOptionPane.showInputDialog("Insira a primeira nota: ");
		String n2 = JOptionPane.showInputDialog("Insira a segunda nota: ");
		String n3 = JOptionPane.showInputDialog("Insira a terceira nota: ");
		
			
			Double nota1 = Double.valueOf(n1);
			Double nota2 = Double.valueOf(n2);
			Double nota3 = Double.valueOf(n3);
			
			Double media = (nota1 + nota2 + nota3) / 3;
			
			JOptionPane.showMessageDialog(null, "A media do aluno/a "+ aluno + " é: "+ media);
			
			if (media > 6) {
				JOptionPane.showMessageDialog(null,"APROVADO/A");
			}
			
			if (media > 4 && media < 6) {
				JOptionPane.showMessageDialog(null, "RECUPERAÇÃO");
			}
			
			if (media < 4) {
				JOptionPane.showMessageDialog(null,"REPROVADO/A");
			}
		

	}

}
