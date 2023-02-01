package br.com.exercio.dois;

import java.util.Scanner;

public class List6 {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		int numeroFazendeiro;
		int tipoDePulverizacao = 0;
		int areaSerPulverizada;
		double totalSoma = 0 ;
		
		
		System.out.println("Digite o numero do Fazendeiro:");
		numeroFazendeiro = input.nextInt();
		
		System.out.println("Digite a quantidade de área a ser pulverizada:");
		areaSerPulverizada = input.nextInt();

		System.out.print("##=================================================## \n");
		System.out.print("|| 1 - Contra Ervas daninhas R$5,00                || \n");
		System.out.print("|| 2 - Contra Gafanhtos      R$10,00               || \n");
		System.out.print("|| 3 - Contra Broca          R$15,00               || \n");
		System.out.print("|| 4 – Contra Tudo           R$25,00               || \n");
		System.out.print("|| 5 – retornar mensagem de erro (opção inválida)  || \n");
		System.out.print("##=================================================## \n");
		tipoDePulverizacao = input.nextInt();
		
		
		switch (tipoDePulverizacao) {
		case 1: {
			
			totalSoma = areaSerPulverizada * 5;
			
			if(totalSoma >=1750) {
				totalSoma -= (areaSerPulverizada * 0.10);
			}
			
			if(areaSerPulverizada >= 300 ) {
				totalSoma = totalSoma  + (areaSerPulverizada * 0.05);
			
			}
			
			break;

		}
		case 2: {
			totalSoma = areaSerPulverizada * 10;
			
			if(totalSoma >=1750) {
				totalSoma -= (areaSerPulverizada * 0.10);
			}
			
			if(areaSerPulverizada >= 300 ) {
				totalSoma = totalSoma  + (areaSerPulverizada * 0.05);
			
			}
			break;

		}
		case 3: {
			totalSoma = areaSerPulverizada * 15;
			
			if(totalSoma >=1750) {
				totalSoma -= (areaSerPulverizada * 0.10);
			}
			
			if(areaSerPulverizada >= 300 ) {
				totalSoma = totalSoma  + (areaSerPulverizada * 0.05);
			
			}
		
			break;

		}
		case 4: {
			totalSoma = areaSerPulverizada * 25;
			
			if(totalSoma >=1750) {
				totalSoma -= (areaSerPulverizada * 0.10);
			}
			
			if(areaSerPulverizada >= 300 ) {
				totalSoma = totalSoma  + (areaSerPulverizada * 0.05);
			
			}
			
			break;

		}

		default:
			System.out.println("Cara vc digitou errado");
			break;
		}
		
		System.out.print("O fazendeiro, N°("+numeroFazendeiro+")");
		System.out.println("Pagará pelo serviço de pulverização: R$:" + totalSoma);

	}

}
