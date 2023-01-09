package br.com.exemplo.estrutura;

public class While04 {

	public static void main(String[] args) {
		int x = 100, y = 0;

		while (x < 5) {
			y = x * 3;
			System.out.println(y);
			x = x + 1;

		}
		System.out.println("Fim");
	}

}
