package es.studium.Segun;

import java.util.Scanner;

public class Segun
{

	public static void main(String[] args)
	{
		int a, b, resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero");
		a = teclado.nextInt();
		System.out.println("Dame otro n�mero");
		b = teclado.nextInt();
		teclado.close();
		if (a < b)
		{
			resultado = (a + b);
			System.out.println("La suma del n�mero1 y el n�mero2 es: " + resultado);
		}
		else
		{

			resultado = (a * b);

			System.out.println("El producto del n�mero1 por el n�mero2 es: " + resultado);
		}
	}

}
