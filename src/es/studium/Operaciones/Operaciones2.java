package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones2
{

	public static void main(String[] args)
	{
		int a, b;
		double cociente;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		a = teclado.nextInt();
		System.out.println("Introduzca otro numero");
		b = teclado.nextInt();
		System.out.println("La suma de los numeros es:" + funSuma(a, b));
		System.out.println("La resta de los numeros es:" + funResta(a, b));
		System.out.println("En producto de los numeros es:" + funProducto(a, b));
		System.out.println("La división de los numeros es:" + funDivision(a, b));
		teclado.close();

	}

	public static double funSuma(int a, int b)
	{

		return (a + b);
	}

	public static double funResta(int a, int b)
	{

		return (a - b);
	}

	public static double funProducto(int a, int b)
	{

		return (a * b);
	}

	public static double funDivision(double a, double b)
	{

		return (a / b);
	}

}
