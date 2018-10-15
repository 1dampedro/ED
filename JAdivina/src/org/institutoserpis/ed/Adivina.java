package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
	//	double doubleAleatorio = Math.random() * 1000;
	//	Random random = (int)doubleAleatorio + 1;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println("Adivina un número entre 1 y 1000.");
		int numeroIntroducido = scanner.nextInt();
		while(numeroIntroducido != numeroAleatorio) {
			if (numeroIntroducido<numeroAleatorio)
				System.out.println("El número que buscas es mayor.");
			else
				System.out.println("El número que buscas es menor.");
			System.out.println("Adivina un número entre 1 y 1000.");
			numeroIntroducido = scanner.nextInt();
		}
		System.out.println("Has acertado!");
	}

}
