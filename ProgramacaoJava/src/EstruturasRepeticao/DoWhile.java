package EstruturasRepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do teclado
		Scanner teclado = new Scanner(System.in);
		
		//Primeiro executa o bloco depois faz a checagem
		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos de idade!");	
			}					
		}while(idade > 0);
		teclado.close();
	}

}
