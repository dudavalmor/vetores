package aulaVetores;

import java.util.Arrays;
import java.util.Collections;

public class Exemplo8 {
	
	public static void main(String[] args ) {
		
		String nomes[] = {"Samantha", "Amanda", "Vinícius", "Cauê", "Leonardo"};
		
		Arrays.sort(nomes);
		
		System.out.println("Array em ordem crescente: \n");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		Arrays.sort(nomes, Collections.reverseOrder());
		System.out.println("\nArray em ordem decrescente: \n");
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
	}
}
