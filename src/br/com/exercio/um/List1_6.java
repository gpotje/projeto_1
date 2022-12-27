package br.com.exercio.um;

import java.util.Scanner;

public class List1_6 {
	
	
	/*
	 * Crie 2 variáveis do tipo ‘int’ solicite para o usuário digitar 2 números inteiros capture 
	 * através do scan some os números e print na tela usando o  println.
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		float n1 = 0;
		
		
		System.out.println("Digite o numero com ponto e virgula por favor: ");
		n1 = sc1.nextFloat();
		
		System.out.println("o numero digitado foi: " + n1 );
		
		
	}

}
