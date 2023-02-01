package br.com.exercio.dois;

import java.util.Scanner;

public class List8 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		Double altura;
		Double Auxiliar;
		String sexo;

		System.out.println("Digite a altura do cidadão:");
		altura = input.nextDouble();
		
		System.out.println("Digite a Sexo do cidadão:");
		sexo = input.next();

		if (sexo.equals("M") || sexo.equals("m") ) {
			Auxiliar = (72.7 * altura) - 58;
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("O peso ideal do cidadão homem é:" + Auxiliar);

		} else if (sexo.equals("F") || sexo.equals("f")) {
			Auxiliar = (62.1 * altura) - 44.7;
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("O peso ideal do cidadão Mulher é:" + Auxiliar);
			
		} else {
			System.out.println("loading...");
			Thread.sleep(400);
			System.out.println("Erro !! foi digitado uma tecla inválida ");

		}

	}
	
	

}
