package br.com.exercio.um.foor;

import java.util.Scanner;

public class ListFor1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int nInicio = 0;
		int nFim = 0;
		
		System.out.println("digite o numero de inicio:");
		nInicio = s.nextInt();
		
		System.out.println("digite o numero final:");
		nFim = s.nextInt();
		
	
		for(int i = nInicio ; i <= nFim;i++) {
			System.out.print(i+", ");
		}
		
		
		
		
	}
	
}
