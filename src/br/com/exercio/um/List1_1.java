package br.com.exercio.um;

import java.util.Scanner;

public class List1_1 {
	
	/*
	 * Crie uma variável do tipo string sem modificador de acesso. 
	 * armazene seu nome usando o scan e imprima na tela usando o println.
	 * */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome = "";
		
		System.out.println("Digite um nome por favor: " + nome);
		nome = s.next();
		
		System.out.println("o nome digitado foi: " + nome);
		
	}

}
