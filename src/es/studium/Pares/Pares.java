package es.studium.Pares;

import java.util.Scanner;

public class Pares
{

	public static void main(String[] args)
	{
		int num1, num2, i;
//Creamos un objeto de la clase Scanner
		Scanner escribir = new Scanner(System.in);
//Creamos una instrucción para que introduzca el usuario los datos
		System.out.println("Introduzca un número, por favor");
		num1 = escribir.nextInt();
		System.out.println("Introduzca un segundo número, por favor");
		num2 = escribir.nextInt();
//Creamos un objeto para
		for (i = num1; i <= num2; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println("El número par es el:" + i);
			}
			escribir.close();
		}

	}

}
