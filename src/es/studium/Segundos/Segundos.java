package es.studium.Segundos;

import java.util.Scanner;

public class Segundos
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		int edad;

		System.out.println("Introduzca su edad");
		edad = teclado.next().charAt(0);
		edad = funcionSeg(edad);
		teclado.close();
		System.out.println("Su edad en segundos es: " + edad);
	}

	public static int funcionSeg(int a)
	{
		int s;

		s = a * 31536000;
		return s;

	}
}
