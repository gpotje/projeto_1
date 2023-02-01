package br.com.exercio.dois;

import java.util.Scanner;

public class List5 {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);

		/*
		 * Palíndromo é uma palavra, frase ou número que permanece igual quando lida de trás para diante	
		 * */
		
		
		int normal;
		int invertido;
		int aux;
		
		String normal_recebido;
		System.out.println("Digite um Número para saber se ele é palíndromo");
		normal = input.nextInt();
		normal_recebido = ""+normal;
		
		while(normal <= 0 || normal_recebido.length() < 4) {
		System.out.print("Por favor, digite um valor de N maior do que zero: \n ");
		System.out.print("OU, digite um valor maior de 3 caracteres \n");
		normal = input.nextInt();
		normal_recebido = ""+normal;
		}
		invertido = 0 ;
		aux = normal;
		
		while (aux > 0) {
			invertido = (invertido*10) + (aux % 10);
			aux = aux / 10;
		}
	
		System.out.println();
		
		if(normal == invertido) {
			System.out.println("São palindromos.");
			System.out.println(invertido);
			System.out.println(normal);
		}else {
			System.out.println("Não são palindromos.");
			System.out.println(invertido);
			System.out.println(normal);
		}

	}

}
