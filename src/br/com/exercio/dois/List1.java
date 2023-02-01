package br.com.exercio.dois;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> listNumeros = new ArrayList<>();
		String resposta = "";
		
		System.out.println("Digite um numero");
		listNumeros.add(input.nextInt());
		
		System.out.println("Deseja Digitar mais numeros ?");
		resposta = input.next();
		
		
		while (!resposta.equals("n")) {
			
			System.out.println("Digite um numero:");
			listNumeros.add(input.nextInt());
			
			System.out.println("Deseja Digitar mais numeros ?");
			resposta = input.next();
		}
		
		
		for (Integer integer : listNumeros) {
			if(integer % 2 == 0) {
				System.out.println(integer + " é Par,");
			}else {
				System.out.println(integer + " é Impar, ");
			}
			
		}
		
		
	}
	
}
