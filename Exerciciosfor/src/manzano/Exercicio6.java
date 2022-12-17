package manzano;

public class Exercicio6 {

	public static void main(String[] args) {
		for (int numero = 1; numero < 20; numero++) {
			int sobra = numero % 2;
			if (sobra == 0) {
				System.out.println("O número"+ numero+ " é par");
			} else {
				System.out.println("O número"+ numero+ " é impar");
			}
		}
	}

}
