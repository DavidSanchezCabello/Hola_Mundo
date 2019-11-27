package es.studium.Suma;

import java.util.Scanner;

public class SumaFuncion
{

	public static void main(String[] args)
	{
		/*
		 * PROGRAMA Suma VARIABLES ENTERO numero1, numero2, r INICIO ESCRIBIR “Dame un
		 * número:” LEER numero1 ESCRIBIR “Dame otro número:” LEER numero2 r =
		 * suma(numero1, numero2) ESCRIBIR “La suma de los dos números es:”+r FIN
		 * FUNCION Suma (ENTERO a,b) DEVUELVE ENTERO INICIO DEVOLVER a+b FIN
		 */
		int numero1, numero2, r;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		numero1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		numero2 = teclado.nextInt();
		r = suma(numero1, numero2);
		System.out.println("La suma de los números es: " + r);
		teclado.close();

	}

	public static int suma(int a, int b)
	{

		return (a + b);

	}
}
