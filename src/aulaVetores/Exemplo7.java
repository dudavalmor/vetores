package aulaVetores;

public class Exemplo7 {
	
	public static void main(String[] args) {
		
		String vetorCachorros [] = {"Boxer","Pastor Alem�o","Pinscher","Husky Siberiano","Corgi"};
		
		System.out.println("Itens dentro do vetor: \n");
		
		for (int i = 0; i < vetorCachorros.length; i++) {
			System.out.println(vetorCachorros[i]);
		}
		
		System.out.println("\nO tamanho do vetor �: " + vetorCachorros.length);
	}

}
