package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones3
{

	public static void main(String[] args)
	{
		int a, b, c, d, e;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el valor del primer número binario ");
		a = teclado.nextInt();
		System.out.println("Introduzca el valor del segundo número binario ");
		b = teclado.nextInt();
		System.out.println("Introduzca el valor del tercer número binario ");
		c = teclado.nextInt();
		System.out.println("Introduzca el valor del cuarto número binario ");
		d = teclado.nextInt();
		System.out.println("Introduzca el valor del quinto número binario ");
		e = teclado.nextInt();

		teclado.close();

		if ((a == 1 || a == 0) && (b == 1 || b == 0) && (c == 1 || c == 0) && (d == 1 || d == 0) && (e == 1 || e == 0))
		{

			System.out.println("El número decimal equivalente es: " + funDecimal(e, d, c, b, a));
		} else
		{
			System.out.println("El número deben estar comprensidos en 0 y 1");
		}

	}

	public static double funDecimal(int e, int d, int c, int b, int a)
	{

		double r;
		r = (e * 16) + (d * 8) + (c * 4) + (b * 2) + (a * 1);
		return r;
	}
}
