package es.studium.Potencia2;

import java.util.Scanner;

public class Potencia2
{

	public static void main(String[] args)
	{
		/*PROGRAMA Potencia2
		VARIABLES
		ENTERO a, b
		INICIO
		ESCRIBIR “Dame un número para la base:”
		LEER a
		ESCRIBIR “Dame un número para el exponente:”
		LEER b
		ESCRIBIR “El número” + a + “elevado a” + b + “es igual a:” + pot (a,b)
		FIN
		FUNCION pot (ENTERO base, ENTERO exponente) DEVUELVE ENTERO
		VARIABLES
		ENTERO i, resultado=1
		INICIO
		PARA i=1 HASTA exponente HACER
		resultado=resultado*base
		FIN PARA
		DEVOLVER resultado
		FIN */
		int a, b;

		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un número para la base:");
		a = teclado.nextInt();
		System.out.println("Introduzca un número para el exponente:");
		b = teclado.nextInt();
		System.out.println("El número " + a + " elevado a " + b + " es igual a: " + potencia(a,b));

		teclado.close();


	}
	public static int potencia(int a, int b) {
		int i, resultado=1;
		for (i=1; i<=b; i++) {
			resultado = resultado * a;

		}
		return resultado;
	}



}
