package es.studium.Dividir;

import java.util.Scanner;

public class Dividir1
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		// double resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numerador");
		numerador = teclado.nextInt();
		System.out.println("Introduce un denominador");
		denominador = teclado.nextInt();
		// resultado = dividir(numerador, denominador);
		System.out.println("La division vale: " + div(numerador, denominador));
		teclado.close();
	}

	public static double div(int a, int b)
	{
		/*
		 * double resultado; 
		 * resultado =(double) a/(double)b;
		 * return(resultado);
		 */
		return ((double) a / (double) b);

	}

}
