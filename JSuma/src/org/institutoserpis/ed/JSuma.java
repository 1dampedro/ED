package org.institutoserpis.ed;

import java.util.Scanner;

public class JSuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0, suma=0;
		System.out.println("Dame 2 números para sumar: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		suma = num1 + num2;
		System.out.println("Suma de " + num1 + " y " + num2 + " = " + suma);

	}

}
