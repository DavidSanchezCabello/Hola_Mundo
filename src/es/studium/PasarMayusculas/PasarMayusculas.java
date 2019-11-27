package es.studium.PasarMayusculas;

import java.util.Scanner;

public class PasarMayusculas
{

	public static void main(String[] args)
	{
		char letra;
		int x, y;

		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca una letra minúscula");
		letra = teclado.next().charAt(0);
		x= letra;
		y= x - 32;
		System.out.println("La letra '"+ letra +"' en mayúscula es '" + (char)y+ "'");
		teclado.close();
	}

}
