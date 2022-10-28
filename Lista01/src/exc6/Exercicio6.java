package exc6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer[] numVet = new Integer[10];
		Integer maior = 0;
		Integer menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < numVet.length; i++) {
			System.out.println("Escreva um valor: ");
			numVet[i] = Integer.valueOf(s.nextLine());
			
			if (numVet[i] > maior) {
				maior = numVet[i];
			}
			
			if (numVet[i] < menor) {
				menor = numVet[i];
				
			}
			
		}
		
		System.out.println("O número maior é " + maior);
		System.out.println("O número menor é " + menor);

	}

}
