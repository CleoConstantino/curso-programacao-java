//if, else, else if
package EstruturasDescisao;

public class ifElse {

	public static void main(String[] args) {
		//Declarando e inicializando uma variável;
		int numero = 5;
		
		if(numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5!");
		}
		else if (numero == 5){
			System.out.println("O número " + numero + " é igual 5!");
		}
		else {
			System.out.println("Não, o número " + numero + " não é maior de 5!");
		}

	}

}
