package poo;

import java.util.Scanner;

public class Avaliacao4Exercicio5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor do salário mínimo atualmente: ");
		float s = sc.nextFloat();
		System.out.printf("Quantidade de quilowatts gasta: ");
		float q = sc.nextFloat();
		
		float pq = (q/100)*(s/7);
		
		System.out.println("\n" + q + " quilowatts = R$" + pq);
		System.out.println("Valor a ser pago: R$" + (s-pq));
		System.out.println("Valor com desconto: R$" + (s-(s-pq)*0.1));
		
		sc.close();
}
}
