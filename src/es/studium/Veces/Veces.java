package es.studium.Veces;

import java.util.Scanner;

public class Veces
{

	public static void main(String[] args)
	{
		int numero, veces, i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero");
		numero = teclado.nextInt();
		System.out.println("Dame otro n�mero");
		veces = teclado.nextInt();
		teclado.close();

		for (i = 1; i <= veces; i++)
		{
			System.out.println(numero);
		}

	}

}
