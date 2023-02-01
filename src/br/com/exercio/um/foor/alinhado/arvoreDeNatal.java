package br.com.exercio.um.foor.alinhado;

public class arvoreDeNatal {

	public static void main(String[] args) {

		int i;
		int j;
		int posi = 6;
		int t = 1 ;
		int i2;
		
		
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= 10; j++)
				if (j == posi) {
					for (i2 = 1; i2 <= t; i2++)
						System.out.print('*');

					t = t + 2;
					posi--;

				} else {
					System.out.print('-');

				}
			System.out.println();
		}
	}
}
