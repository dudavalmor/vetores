package aulaVetores;

import java.util.Arrays;

public class Exemplo9 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = {3, 2, 1, 6, 5, 10, 7, 4, 9, 8};
		
		Arrays.sort(vetorInteiros);
		
		System.out.println("Array de primitivos em Ordem Crescente\n");
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println(vetorInteiros[i]);
		}
		
		System.out.println("\nArray de primitivos em Ordem Decrescente\n");
		
		int [] reverseArray = new int[vetorInteiros.length];
		for(int i = 0; i < vetorInteiros.length; i++) {
			reverseArray[i] = vetorInteiros[(vetorInteiros.length - 1) - i];
		}
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println(reverseArray[i]);
		}
	}
}
