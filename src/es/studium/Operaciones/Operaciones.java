package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		int num1, num2, suma, resta, producto;
		double cociente;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero");
		num1 = teclado.nextInt();
		System.out.println("Dame un n�mero");
		num2 = teclado.nextInt();
		suma = (num1 + num2);
		resta = (num1 - num2);
		producto = (num1 * num2);
		cociente = ((double)num1 /(double) num2);
		System.out.println("La suma de los n�meros es: " + suma);
		System.out.println("La resta de los n�meros es: " + resta);
		System.out.println("El producto de los n�meros es: " + producto);
		if (num2 == 0)
		{
			System.out.println("El numero no puede ser 0");

		} 
		else
		{
			System.out.println("La divisi�n de los n�meros es: " + cociente);

		}
	}

}
