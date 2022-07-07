package poo;

import java.util.Scanner;

public class Avaliacao4Exercicio7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Norte(1), Nordeste(2), Centro-Oeste(3) ou Sul(4): ");
		int destino = sc.nextInt();
		System.out.printf("Ida(0) ou IdaVolta(1): ");
		int valor = sc.nextInt();
		
		int preco=0;
		
		if (destino==1 && valor==0) {
			preco=500;}
		if (destino==1 && valor==1) {
			preco=900;}
		if (destino==2 && valor==0) {
			preco=350;}
		if (destino==2 && valor==1) {
			preco=650;}
		if (destino==3 && valor==0) {
			preco=350;}
		if (destino==3 && valor==1) {
			preco=600;}
		if (destino==4 && valor==0) {
			preco=300;}
		if (destino==4 && valor==1) {
			preco=550;}
		
		System.out.println("\nValor a ser pago: R$" + preco);
		
		
		sc.close();
}
}
