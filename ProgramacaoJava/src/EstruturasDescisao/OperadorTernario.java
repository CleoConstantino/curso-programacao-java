//Operador tern�rio

package EstruturasDescisao;

public class OperadorTernario {

	public static void main(String[] args) {
		int valor = 3, numero;
		
		/*if (valor > 0) {
			numero = valor;
		}
		else {
			numero = 7;
		}*/
		
		// Operador tern�rio (numero = valor � maior que 0, sim, recebe valor, se n�o recebe 7;)
		// obs: funciona como o if, else.
		numero = (valor > 0) ? valor : 7;
		
		System.out.println(numero);

	}

}
