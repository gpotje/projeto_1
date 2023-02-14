package br.com.exercio.tres;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 5, 2, 4, 3, 0, 9};
		selectionSort(array);
	}

	public static void selectionSort(int[] array) {

		System.out.println("Array original");
		for (int numero : array) {
			System.out.print(numero + ", ");
		}

		// for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
		 for (int fixo = 0; fixo < array.length - 1; fixo++) {
			    int menor = fixo;

			    for (int i = menor + 1; i < array.length; i++) {
			       if (array[i] < array[menor]) {
			          menor = i;
			       }
			    }
			    if (menor != fixo) {
			      int t = array[fixo];
			      array[fixo] = array[menor];
			      array[menor] = t;
			    }
			  }

		System.out.println();
		System.out.println("Array ordenado");
		for (int numero : array) {
			System.out.print(numero + ", ");
		}
	}

}
