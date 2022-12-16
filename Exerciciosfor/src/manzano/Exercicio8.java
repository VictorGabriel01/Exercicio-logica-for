package manzano;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base:");
		float base = sc.nextFloat();
		System.out.println("Digite o valor do expoente:");
		float expo = sc.nextFloat();
		float resultado = 1;
		int contador;
		for (contador = 1; contador <= expo; contador++) {
		    resultado = resultado * base;
		}
		System.out.println(base+" elevado a "+expo+" é "+resultado);
	}

}
