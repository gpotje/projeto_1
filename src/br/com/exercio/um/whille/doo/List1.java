package br.com.exercio.um.whille.doo;

import java.io.IOException;
import java.util.Scanner;


public class List1 {
	
	public static void main(String[] args) throws InterruptedException, IOException  {
	
		Scanner s = new Scanner(System.in);
		int n1,n2;
		String opcao,resposta="";
		
		do {
			
			System.out.println("digite a opeção desejada");
			System.out.println("* multiplicação");
			System.out.println("+ soma");
			System.out.println("- subtração");
			System.out.println("/ divisão");
			opcao = s.next();
			
			System.out.println("digite o primeiro numero");
			n1 = s.nextInt();
			
			
			System.out.println("digite o segundo numero");
			n2 = s.nextInt();
			
			switch (opcao) {
			case "*": {
				System.out.println("Resultado é: " + n1 *n2);
			break;
			}
			case "+": {
				System.out.println("Resultado é: " + n1+n2);
			break;
			}
			case "-": {
				int temp = n1-n2;
				System.out.println("Resultado é: " + temp);
			break;
			}case "/": {
				System.out.println("Resultado é: " + n1/n2);
			break;
			}
			default:
				System.out.println("Digito invalido");
			}
			
			System.out.println("Deseja fazer uma nova operação ?  n ou s");
			resposta = s.next();
			
		}while(!resposta.equals("n"));
		
		
	}

}
