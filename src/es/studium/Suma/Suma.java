package es.studium.Suma;

import java.util.Scanner;

public class Suma
{

	public static void main(String[] args)
	{
		int num1, num2, suma;

		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un número");
		num1=teclado.nextInt();
		System.out.println("Introduzca otro número");
		num2=teclado.nextInt();
		teclado.close();

		suma = (num1+num2);

		System.out.println("La suma es: " + suma);

	}

}
