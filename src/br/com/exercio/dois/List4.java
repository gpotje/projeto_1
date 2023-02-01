package br.com.exercio.dois;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);

		int numeros[] = new int[4];
		int maior = 0;
		int menor = Integer.MAX_VALUE;

		for (int i = 1; i < numeros.length; i++) {

			System.out.println("Digite o número ");
			numeros[i] = input.nextInt();

			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}

		}
		System.out.println("loading...");
		System.out.println("calculando...");
		Thread.sleep(800);
		System.out.println("O menor numero é : "+menor);
		System.out.println("O maior numero é : "+maior);
	}

}
