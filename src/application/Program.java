/*Programa que l� 5 n�meros e informa o maior n�mero e a m�dia
desses n�meros.
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
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			
			count = count + 1;
			System.out.println("Maior n�mero: " + maior);
			System.out.println("M�dia: " + soma/5);
		} while(count < 5);
	}
}
