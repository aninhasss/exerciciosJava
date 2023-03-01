package poo;

import java.util.Scanner;

public class Avaliacao4Exercicio1 {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o saldo atual: ");
		float saldo = sc.nextFloat();
		System.out.printf("Digite o valor percentual: ");
		float valor = sc.nextFloat();
		
		valor = valor/100;
		float novo = saldo-valor;
		
		System.out.println("\nNovo saldo: " + novo);
		
		sc.close();
}
}
