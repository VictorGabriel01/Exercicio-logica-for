package manzano;

public class Exercicio10 {

	public static void main(String[] args) {
		int Ce = 1;
		int contador;
		for (contador = 1; contador < 11; contador++) {
		    float Fa = (9*Ce + 160)/5;
		     Ce = Ce + 10;
		    System.out.println(Ce+"°"+Fa+"°");
		}
	}

}
