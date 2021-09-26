package EstruturasRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		// Primeiro faz a checagem para depois executar
		while(idade > 0) {
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