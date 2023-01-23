package br.com.exercio.um.whille;

import java.util.Scanner;

public class List8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanho;
		int count = 0 ;
		int count2 = 0 ;
		
		System.out.print("O numero tamanho : ");
		tamanho = entrada.nextInt();
		

		while (count < tamanho) {
			count2 = 0;
			while (count2 < tamanho) {
				if(count2 % 2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				count2 ++;
			}
			count ++;
			System.out.println();
		}

	
		
	}

}
