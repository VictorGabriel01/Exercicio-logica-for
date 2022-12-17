package manzano;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		for (int contadora = 1; contadora < 11; contadora++) {
			System.out.println(numero +" x "+contadora);
			 contadora = numero*contadora;
			 System.out.println("O resultado " + contadora);
		}
		sc.close();
	}

}
