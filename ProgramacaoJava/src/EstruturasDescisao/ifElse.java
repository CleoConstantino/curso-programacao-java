//if, else, else if
package EstruturasDescisao;

public class ifElse {

	public static void main(String[] args) {
		//Declarando e inicializando uma vari�vel;
		int numero = 5;
		
		if(numero > 5) {
			System.out.println("Sim, o n�mero " + numero + " � maior que 5!");
		}
		else if (numero == 5){
			System.out.println("O n�mero " + numero + " � igual 5!");
		}
		else {
			System.err.println("N�o, o n�mero " + numero + " n�o � maior de 5!");
		}

	}

}