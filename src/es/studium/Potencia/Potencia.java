package es.studium.Potencia;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{
		int base, exponente, resultado, i;
		Scanner teclado = new Scanner(System.in);
		resultado = 1;
		System.out.println("Introduzca un número para la base");
		base = teclado.nextInt();
		System.out.println("Introduzca un número para el exponente");
		exponente = teclado.nextInt();
		teclado.close();

		for (i = 1; i <= exponente; i++)
		{
			resultado = resultado * base;
		}
		System.out.println("El número " + base + " elevado a " + exponente + " es " + resultado);

	}

}
