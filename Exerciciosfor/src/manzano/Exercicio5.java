package manzano;

public class Exercicio5 {

	public static void main(String[] args) {
		for (int numero = 1; numero < 20; numero++) {
			int sobra = numero % 2;
			if (sobra == 0) {
				System.out.println("O n�mero"+ numero+ " � par");
			} else {
				System.out.println("O n�mero"+ numero+ " � impar");
			}
		}
	}

}
