package br.com.exercio.um.foor.alinhado;

import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int colunaTamanho = 0;
		int linhaTamanho = 0;

		System.out.println("Digite quantas colunas a tabela vai ter: ");
		colunaTamanho = s.nextInt();

		System.out.println("Digite quantas linhas a tabela vai ter: ");
		linhaTamanho = s.nextInt();

		for (int colunaFor = 1; colunaFor <= colunaTamanho; colunaFor++) {

			System.out.print(colunaFor + "-");

			for (int linhaFor = 1; linhaFor <= linhaTamanho; linhaFor++) {
				if (linhaFor == 1) {
					System.out.print("|");
				}

				if (linhaFor == colunaFor) {
					System.out.print("Erika" + "|");
				} else {
					System.out.print("X" + "|");
				}

			}
			System.out.println();
		}
	}

}
