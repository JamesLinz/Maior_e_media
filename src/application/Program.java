/*Programa que lê 5 números e informa o maior número e a média
desses números.
*/
package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			
			count = count + 1;
			System.out.println("Maior número: " + maior);
			System.out.println("Média: " + soma/5);
		} while(count < 5);
	}
}
