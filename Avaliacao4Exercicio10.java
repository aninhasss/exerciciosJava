package poo;

import java.util.Scanner;

public class Avaliacao4Exercicio10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um número inteiro qualquer: ");
		int x = sc.nextInt();
		
		int y=0;
		
		if (x<=1) {
			y=1;}
		if (x>1 && x<=2) {
			y=2;}
		if (x>2 && x<=3) {
			y=x*x;}
		if (x>3) {
			y=x*x*x;}
		
		System.out.println("y = " + y);
		sc.close();
		
}
}
