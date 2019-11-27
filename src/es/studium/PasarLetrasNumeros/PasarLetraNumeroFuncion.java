package es.studium.PasarLetrasNumeros;

import java.util.Scanner;

public class PasarLetraNumeroFuncion
{

	public static void main(String[] args)
	{
		char letra;
		int x, y;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una letra");
		letra = teclado.next().charAt(0);
		

		x = (int) letra;
		y = x - 96;

		if (letra == '*')
		{
			System.out.println("Adiós");

		} else
		{
			System.out.println("La letra indicada corresponde al número" + " " + y);
		}
		while (letra != '*');
		teclado.close();
			
	}
}
