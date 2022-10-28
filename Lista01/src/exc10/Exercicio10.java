package exc10;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		Integer n1, n2, n3;
	
		System.out.println("Insira a primeira nota: ");
		n1 = Integer.valueOf(s.nextLine());
	
		System.out.println("Insira a segunda nota: ");
		n2 = Integer.valueOf(s.nextLine());
	
		System.out.println("Insira a terceira nota: ");
		n3 = Integer.valueOf(s.nextLine());
		
		float media = calMedia(n1,n2,n3);
		
		if (media >= 6) {
			System.out.println("APROVADO(A)");
		}
		
		if (media >= 4 && media <= 6) {
			System.out.println("RECUPERAÇÃO");
		}
		
		if (media < 4) {
			System.out.println("REPROVADO");
		}
	}

	private static float calMedia(Integer n1, Integer n2, Integer n3) {

		return 0;
	}
}
