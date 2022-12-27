package br.com.exercio.um;

import java.util.Scanner;

public class List1_3 {
	
	
	/*
	 * Crie 2 variáveis do tipo ‘int’ solicite para o usuário digitar 2 números inteiros capture 
	 * através do scan some os números e print na tela usando o  println.
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int soma = 0;
		
		System.out.println("Digite o primeiro numero por favor: ");
		n1 = sc1.nextInt();
		
		System.out.println("Digite o segundo numero por favor: ");
		n2 = sc1.nextInt();
		
		System.out.println("Digite o terceiro numero por favor: ");
		n3 = sc1.nextInt();
		
		soma = n1 + n2 + n3;
		
		System.out.println("o 1° digitado foi: " + n1 + "o 2° digitado foi: "+ n2  
				+"o 3° digitado foi: " + n3 + "a soma entre os dois é: " + soma);
		
		
	}

}
