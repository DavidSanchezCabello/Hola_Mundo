package es.studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar
{

	public static void main(String[] args)
	{
		/*PROGRAMA TablaMultiplicar
		VARIABLES
		ENTERO numero, i
		INICIO
		ESCRIBIR �Dame un n�mero:�
		LEER numero
		ESCRIBIR �La tabla de multiplicar del n�mero� + numero + �es:�
		PARA i=0 HASTA 10 HACER
		ESCRIBIR numero + �x� + i + �=� + numero*i
		FIN PARA
		FIN */

		int numero, i;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un n�mero, por favor");
		numero = teclado.nextInt();
		System.out.println("La tabla de multiplicar del n�mero " + numero + "es: ");
		teclado.close();

		for (i=0; i<= 10; i++) 
		{
			System.out.println(numero + "x" + i + "=" + numero*i);
		}

	}

}
