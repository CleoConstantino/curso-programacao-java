package EstruturasRepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		//Vari�vel de controle; condi��o de parada; forma de incremento
			for(int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos de idade!");	
			}		
		}		
		teclado.close();
	}
}