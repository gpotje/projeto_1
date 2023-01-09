package br.com.exercio.um.foor;

import java.util.Scanner;

public class ListFor2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int cont = 0;
		
		for(int i = 0 ; i <= 50;i++) {
			if(i%2 == 0) {
				System.out.print(i+", ");
				cont ++;
			}
			
		}
		System.out.println();
		System.out.println("a quantidade de numero é:" + cont);
	}
	
}
