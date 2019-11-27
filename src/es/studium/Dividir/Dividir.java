package es.studium.Dividir;

import java.util.Scanner;

public class Dividir
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el valor del numerador");
		numerador = teclado.nextInt();
		System.out.println("Introduzca el valor del denominador");
		denominador = teclado.nextInt();

		resultado = (double)numerador / (double)denominador;

		System.out.println("El resultado de la división es:" + resultado); //¿Porqué no obtengo decimales?
		teclado.close();
	}

}
