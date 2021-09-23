package EstruturasRepeticao;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		//Para receber dados d usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Informe sua idade: ");
		idade = teclado.nextInt();
		
		System.out.println(nome + " tem " + idade + " anos de idade!");
		
		teclado.close();
	}
	
	

}
