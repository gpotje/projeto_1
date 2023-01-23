package br.com.exercio.um.whille;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior, num;
		int count = 2;
		List<Integer> numeros = new ArrayList<>();

		System.out.print("Numero 1: ");
		num = entrada.nextInt();
		maior = num;

		while (count < 10) {
			System.out.print("Numero " + count + ": ");
			num = entrada.nextInt();
			numeros.add(num);
			
			if (num > maior) {
				maior = num;
			}

			count++;
		}

		 System.out.println("O maior numero digitado é: " + maior);
		 Collections.sort(numeros);
		 for(Integer n: numeros) System.out.print(n+", ");
	
	}

}
