package aulaVetores;

import java.util.Arrays;

public class Exemplo10 {
	
	public static void main(String[] args) {
		
		String grupoA[] = {"Amanda", "Ellen", "Vin�cius"};
		String grupoB[] = {"Samantha", "Let�cia", "Allan"};
		
		System.out.println("Os arrays s�o iguais? ");
		
		if(Arrays.equals(grupoA,grupoB)) {
			System.out.println("Sim, s�o iguais");
		} else { 
			System.out.println("N�o, n�o s�o iguais");
		}
	}

}
