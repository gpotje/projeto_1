package br.com.exemplo.estrutura;

public class While05 {

	public static void main(String[] args) {
		int x = 2, y = 10;

		System.out.println("Olá");

		while (x < y) {
			System.out.println(x + "-" + y);
			y = x * 2;
			y = y + 1;

		}

	}

}
