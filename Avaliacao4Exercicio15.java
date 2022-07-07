package poo;

public class Avaliacao4Exercicio15 {
	public static void main(String args[]) {
		

		double C = 1.50;
		double J = 1.11;
		
		int i=0;
		do {
			C = C + 0.2;
			J = J + 0.3;
			i++;
		
		}while(C>J);
		System.out.printf("Após " + i + " anos");
		
		
}
}
