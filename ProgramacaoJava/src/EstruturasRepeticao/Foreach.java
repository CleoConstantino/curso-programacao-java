package EstruturasRepeticao;

public class Foreach {

	public static void main(String[] args) {
		String nome = "Cléo Constantino";
		
		//Para cada uma dos caracteres da string , imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);			
		}

	}

}
