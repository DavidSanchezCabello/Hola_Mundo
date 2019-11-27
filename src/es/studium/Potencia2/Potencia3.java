package es.studium.Potencia2;

import java.util.Scanner;

public class Potencia3
{

	public static void main(String[] args)
	{
		int base, exponente;

		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca la base");
		base = teclado.nextInt();
		System.out.println("Introduzca el exponente");
		exponente = teclado.nextInt();
		teclado.close();
		System.out.println(potencia(base,exponente));

	}
	public static double potencia(int a,int b) {

		double resultado=1;
		for (int i = 1; i<=b; i++) {

			resultado = resultado * b;

		}
		return (resultado);

	}
}
