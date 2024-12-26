package aulaVetores;

import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {
		
		int vetorInteiros [] = new int[5];
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorInteiros[i] = leia.nextInt();
		}
		
		System.out.println("\nOs números digitados foram: \n");
		
		for(int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i+1) + "º número: " + vetorInteiros[i]);
		}

	}

}
