package manzano;

public class Exercicio7 {

	public static void main(String[] args) {
		int resultado = 0;
		int contador;
		for (contador = 0; contador < 16; contador++) {
		    resultado = resultado*3;
		    if (resultado == 0) {
		       resultado = resultado+1;
		    }
		    System.out.println("3 ^ "+contador+" = "+resultado);
	}

	}
}
