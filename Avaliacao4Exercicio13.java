package poo;

import java.util.Scanner;

public class Avaliacao4Exercicio13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um valor inteiro maior ou igual a 2: ");
		int b = sc.nextInt();
		System.out.printf("Digite um valor inteiro maior do que 1: ");
		int n = sc.nextInt();
		
		System.out.println(b + " elevado a " + n + " = " + Math.pow (b, n));
		
		sc.close();
}
}
