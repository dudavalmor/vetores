package aulaVetores;

public class Exemplo5 {
	
	public static void main (String [] args) {
		String vetorString[] = {"Boxer", "Pastor Alem�o", "Labrador", "Border Collie", "Pinscher", 
				"Husky Siberiano", "Corgi"};
		
		for (int i = 0; i < vetorString.length; i++) {
			System.out.println((i+1) + "� elemento: " + vetorString[i]);
		}
	}

}
