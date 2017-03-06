package hr.fer.zemris.java.p01;


/** Program koji ispisuje stringove zadane preko naredbenog retka.
*
*@author Marko Čupić
*/

import java.util.Scanner;

public class P06 {

	/**
	* Metoda od koje kreće izvođenje programa.
	*
	*@params args argumenti zadani preko naredbenog retka
	*/

	public static void main(String[] args) {
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		// nikad vise scannera jer se natjecu za isti resurs (tretiramo kao globalni resurs)
		// ako ga neka metoda treba saljemo ga kao referencu

		while(true) {
			if(sc.hasNextInt()) {
				int current = sc.nextInt();
				if(current < 0) {
					break;
				}
				suma += current;
			} else {
				String elem = sc.next();
				System.out.format("Argument '%s' nije broj - yanemarit cemo ga.%n", elem);
			}
		}
        System.out.printf("Suma je %d.%n", suma);
        sc.close();
	}
}
