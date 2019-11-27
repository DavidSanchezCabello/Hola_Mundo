package es.studium.Compara;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		int num1, num2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer número, por favor");
		num1 = teclado.nextInt();
		System.out.println("Introduzca un segundo número, por favor");
		num2 = teclado.nextInt();

		if (num1 == num2)
		{
			System.out.println("Los números son iguales");
		} 
		else if (num1 < num2)
		{
			System.out.println("El primer número es menor que el segundo");
		} 
		else
		{

			System.out.println("El segundo número es mayor que el primero");
		}
		teclado.close();
	}

}
