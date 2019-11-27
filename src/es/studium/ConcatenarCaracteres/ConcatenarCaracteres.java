package es.studium.ConcatenarCaracteres;

import java.util.Scanner;

public class ConcatenarCaracteres
{

	public static void main(String[] args)
	{
		char letra1,letra2;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un caracter");
		letra1 = teclado.next().charAt(0);
		System.out.println("Introduzca un caracter");
		letra2 = teclado.next().charAt(0);

		System.out.println("Las letras introducidas son: " + letra1 + letra2);
		teclado.close();
	}

}
