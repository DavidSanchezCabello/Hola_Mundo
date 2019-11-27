package es.studium.Segun;

import java.util.Scanner;

public class Segun
{

	public static void main(String[] args)
	{
		int a, b, resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número");
		a = teclado.nextInt();
		System.out.println("Dame otro número");
		b = teclado.nextInt();
		teclado.close();
		if (a < b)
		{
			resultado = (a + b);
			System.out.println("La suma del número1 y el número2 es: " + resultado);
		}
		else
		{

			resultado = (a * b);

			System.out.println("El producto del número1 por el número2 es: " + resultado);
		}
	}

}
