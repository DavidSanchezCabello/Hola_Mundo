package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		int num1, num2, suma, resta, producto;
		double cociente;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número");
		num1 = teclado.nextInt();
		System.out.println("Dame un número");
		num2 = teclado.nextInt();
		suma = (num1 + num2);
		resta = (num1 - num2);
		producto = (num1 * num2);
		cociente = ((double)num1 /(double) num2);
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La resta de los números es: " + resta);
		System.out.println("El producto de los números es: " + producto);
		if (num2 == 0)
		{
			System.out.println("El numero no puede ser 0");

		} 
		else
		{
			System.out.println("La división de los números es: " + cociente);

		}
	}

}
