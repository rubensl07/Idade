// Rubens Luiz Lobo de Almeida
// 10/03/2023
// DS1BIT

package br.senai.sp.jandira;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a sua idade:");
		double a = teclado.nextInt();
		
		double resultado = a * 365;
		
		System.out.println("Você já viveu aproximadamente um total de " + resultado + " dias" );
	}

}