package br.com.exercio.um.foor.alinhado;

import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("digite um caracter");
		String c = s.next();

		for (int coluna = 1; coluna < 4; coluna++) {

			System.out.print(coluna + "-");

			for (int linha = 1; linha < 4; linha++) {
				if (linha == 1) {
					System.out.print("|");
				}
				System.out.print(c+"|");

			}
			System.out.println();
		}
	}

}
