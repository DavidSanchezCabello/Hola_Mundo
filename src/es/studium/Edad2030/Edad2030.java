package es.studium.Edad2030;

import java.util.Scanner;

public class Edad2030
{

	public static void main(String[] args)
	{
		int anyo;
		String nombre;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indique su Nombre.");
		nombre = teclado.next();
		System.out.println("Indique el año de nacimiento.");
		anyo = teclado.nextInt();
		teclado.close();

		System.out.println("Hola " + nombre + "en el año 2030 tendrás " + (2030 - anyo) + "años");

	}

}
