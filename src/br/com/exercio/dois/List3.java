package br.com.exercio.dois;

import java.util.Scanner;

public class List3 {

	public static void main(String[] args) throws InterruptedException{
		Scanner input = new Scanner(System.in);

		Double nota1;
		Double nota2;
		Double media;
		
		System.out.println("Digite a primeira nota do cidadão:");
		nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota do cidadão:");
		nota2 = input.nextDouble();
		
		System.out.println("loading...");
		System.out.println("calculando...");
		Thread.sleep(800);
		
		media = (nota1 + nota2) / 2 ;
		
		
		if (media >= 9.0) {
			System.out.println("loading...");
			Thread.sleep(400);
			System.out.println("Parabéns cidadão vc é o cara :" + media);

		} else if (media < 9.0 && media >= 8.0) {
			System.out.println("loading...");
			Thread.sleep(400);
			System.out.println("Tá saindo da jaula o monstro :" + media);
			
		} else if (media < 8.0 && media >= 7.0) {
			System.out.println("loading...");
			Thread.sleep(400);
			System.out.println("Melhor que nada ​para o meia boca:" + media);

		}else {
			System.out.println("loading...");
			Thread.sleep(400);
			System.out.println("Vixi esse vai apanhar em casa!" + media);
		}

	}

}
