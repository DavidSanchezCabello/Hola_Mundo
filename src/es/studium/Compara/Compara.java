package es.studium.Compara;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		int num1, num2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer n�mero, por favor");
		num1 = teclado.nextInt();
		System.out.println("Introduzca un segundo n�mero, por favor");
		num2 = teclado.nextInt();

		if (num1 == num2)
		{
			System.out.println("Los n�meros son iguales");
		} 
		else if (num1 < num2)
		{
			System.out.println("El primer n�mero es menor que el segundo");
		} 
		else
		{

			System.out.println("El segundo n�mero es mayor que el primero");
		}
		teclado.close();
	}

}
