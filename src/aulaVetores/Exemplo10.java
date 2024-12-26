package aulaVetores;

import java.util.Arrays;

public class Exemplo10 {
	
	public static void main(String[] args) {
		
		String grupoA[] = {"Amanda", "Ellen", "Vinícius"};
		String grupoB[] = {"Samantha", "Letícia", "Allan"};
		
		System.out.println("Os arrays são iguais? ");
		
		if(Arrays.equals(grupoA,grupoB)) {
			System.out.println("Sim, são iguais");
		} else { 
			System.out.println("Não, não são iguais");
		}
	}

}
