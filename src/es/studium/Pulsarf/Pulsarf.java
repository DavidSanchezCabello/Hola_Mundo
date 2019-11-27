package es.studium.Pulsarf;

import java.util.Scanner;

public class Pulsarf
{

	public static void main(String[] args)
	{
		char letra;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Escriba una letra");
		letra = teclado.next().charAt(0);
		
		while (letra != 'f') {
			

			System.out.println("La letra introducida es la: "+ letra);
			
			System.out.println("Escriba una letra");
			letra = teclado.next().charAt(0);
			
			
		}

	}

}
