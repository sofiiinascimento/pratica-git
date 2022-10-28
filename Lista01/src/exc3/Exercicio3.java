package exc3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Insira um número: ");
		String variavel = s.nextLine();
		
		Integer x = Integer.valueOf(variavel);
		System.out.println("O inserido foi " + x + " e ele foi convertido :)");
		
	}
}
