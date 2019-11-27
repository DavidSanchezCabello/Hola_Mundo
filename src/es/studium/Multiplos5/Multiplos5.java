package es.studium.Multiplos5;

import java.util.Scanner;

public class Multiplos5
{

	public static void main(String[] args)
	{
		int num1, num2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número");
		num2 = teclado.nextInt();
		teclado.close();

		if (num1 < num2)
		{

			for (int i = num1; i <= num2; i++)
			{

				if (i % 5 == 0)
				{
					System.out.println(i);
				}

			}

		} else
			System.out.println("error");

	}

}
