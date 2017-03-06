package hr.fer.zemris.java.p01;
/** Program koji ispisuje stringove zadane preko naredbenog retka.
*
*@author Marko Čupić
*/

public class P03 {

	static class MyInteger {
		int value;
	}

	/**
	* Metoda od koje kreće izvođenje programa.
	*
	*@params args argumenti zadani preko naredbenog retka
	*/

	public static void main(String[] args) {
		MyInteger i1 = null;
		i1 = new MyInteger();
		i1.value = 7;
		m(i1);
		int current = i1.value;
		System.out.println(current);
	}

	private static void m(MyInteger i) {
		i.value = i.value * 2;
	}

}
