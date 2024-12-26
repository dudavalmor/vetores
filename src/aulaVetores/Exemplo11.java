package aulaVetores;

import java.util.Arrays;

public class Exemplo11 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = {1, 2, 3, 4, 5, 10, 7, 6, 9, 8};
		
		Arrays.sort(vetorInteiros);
		
		System.out.println("\nVetor Ordenado");
		
		for(int i = 0; i < vetorInteiros.length; i++) {
			System.out.println(vetorInteiros[i]);
		}
		
		System.out.println("\nO elemento 10 existe? Qual a posição?");
		
		int posicao = Arrays.binarySearch(vetorInteiros, 10);
		
		if(posicao >= 0)
			System.out.println("\nO elemento foi encontrado e está na posição de número: " + posicao);
		else 
			System.out.println("\nO elemento não foi encontrado");

	}

}
