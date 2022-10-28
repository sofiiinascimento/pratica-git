package exc2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = s.nextLine();

		System.out.println("Digite sua idade: ");
		String id = s.nextLine();

		Integer x = Integer.valueOf(id);
		System.out.println(nome + " tem " + x + " anos");
	}
}
