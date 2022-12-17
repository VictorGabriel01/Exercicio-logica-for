package manzano;

public class Exercicio9 {

	public static void main(String[] args) {
		int valor2 = 1;
		int valor1 = 1;
		System.out.println("1");
		int contador;
		for (contador = 1; contador < 16; contador++) {
		    var valor3 = valor1 + valor2;
		    System.out.println(valor3);
		     valor1 = valor2;
		     valor2 = valor3;
		    contador++;
		}
	}

}
