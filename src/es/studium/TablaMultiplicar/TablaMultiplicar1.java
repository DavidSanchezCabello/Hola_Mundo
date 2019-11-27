package es.studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar1
{

	public static void main(String[] args)
	{
		int num;

		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un número, por favor");
		num= teclado.nextInt();
		teclado.close();
		for (int i=0; i<=9; i++) {

			int resultado = i*num;

			System.out.println("La tabla de multiplicar del  " + num + " es" + " x " + i + " = "+ resultado);
		}


	}

}
