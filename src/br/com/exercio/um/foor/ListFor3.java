package br.com.exercio.um.foor;

import java.util.Scanner;

public class ListFor3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int n1 = 0;
		
		System.out.println("digite um numero para fazer a tabuada:");
		n1=s.nextInt();
		
		for(int i = 0 ; i <= 10;i++) {
			System.out.println(n1+" x "+i+"  = "+i*n1);
		}
		
	}
	
}
