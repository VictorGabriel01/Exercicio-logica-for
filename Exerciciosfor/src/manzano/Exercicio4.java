package manzano;

public class Exercicio4 {

	public static void main(String[] args) {
		int soma = 1;
		for (int contador = 1; contador < 501; contador++) {
			if (contador % 2 == 0) {
				soma = soma +contador;
			}
			System.out.println("A somatoria de todos os valores pares de 1 a 500 é: "+ soma);
		}
	}

}
