package hr.fer.zemris.java.p01;
/** Program koji ispisuje stringove zadane preko naredbenog retka.
*
*@author Marko Čupić
*/

public class P02 {

	/**
	* Metoda od koje kreće izvođenje programa.
	*
	*@params args argumenti zadani preko naredbenog retka
	*/

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.printf("%d. %s%n",i, args[i]);
		}
	}
}
