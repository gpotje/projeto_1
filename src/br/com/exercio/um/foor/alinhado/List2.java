package br.com.exercio.um.foor.alinhado;

public class List2 {

	public static void main(String[] args) {

		for (int coluna = 1; coluna < 4; coluna++) {

			System.out.print(coluna + "-");

			for (int linha = 1; linha < 4; linha++) {
				if (linha == 1) {
					System.out.print("|");
				}
				if (linha == coluna) {
					System.out.print("O" + "|");
				} else {
					System.out.print("X" + "|");
				}

			}
			System.out.println();
		}

	}

}
