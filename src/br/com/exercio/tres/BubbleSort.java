package br.com.exercio.tres;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 5, 2, 4, 3, 0, 9};
		bubbleSort(array);
	}

	public static void bubbleSort(int[] array) {

		System.out.println("Array original");
		for (int numero : array) {
			System.out.print(numero + ", ");
		}

		// for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
		for (int i = 0; i < array.length - 1; i++) {

			// for utilizado para ordenar o vetor.
			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j] > array[j + 1]) {
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}

			}
		}

		System.out.println();
		System.out.println("Array ordenado");
		for (int numero : array) {
			System.out.print(numero + ", ");
		}
	}

}
