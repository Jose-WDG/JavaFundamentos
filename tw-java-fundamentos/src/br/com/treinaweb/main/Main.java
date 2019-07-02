/*
	autor: José Ramalho.
	email: neto.silva101@outlook.com.
	descrição: projeto de estudos com java, calculadora com as operações basica da matematica.
*/

package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> historico = new ArrayList<String>();
		
		System.out.print("s para continuar e n para finalizar: ");
		char opcao = scanner.next().charAt(0);
		
			while(opcao == 's') {
				
				System.out.print("Digite o primeiro numero: ");
				int n1 = scanner.nextInt();
				
				System.out.print("Digite a operação: ");
				char operacao = scanner.next().charAt(0);
				
				System.out.print("Digite o segundo numero: ");
				int n2 = scanner.nextInt();
				
				int resultado = 0;
				switch (operacao) {
					case '+':
						resultado = n1+n2;
						break;
					case '-':
						resultado = n1-n2;
						break;
					case '/':
						resultado = n1/n2;
						break;
					case 'x':
						resultado = n1*n2;
						break;
					default:
						System.out.println("O valor inserido em operação não é uma operação!");
						break;
				

				}
				
				System.out.println( String.format("%d %c %d = %d \n", n1,operacao,n2,resultado) );
				//int idade2 = Integer.parseInt(idade);
				//System.out.println("Idade: "+idade2);
										
				String entrada = String.format("%d %c %d = %d \n", n1,operacao,n2,resultado);
				historico.add(entrada);
				//System.out.println(entrada);
				System.out.print("s para continuar e n para finalizar: ");
				opcao = scanner.next().charAt(0);
			}
		
		historico.forEach(itemHistorico -> System.out.println(itemHistorico));
		
		scanner.close();
	}

}
