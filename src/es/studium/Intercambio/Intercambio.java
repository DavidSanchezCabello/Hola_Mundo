package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio
{

	public static void main(String[] args)
	{
		int num1, num2, comodin;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número");
		num1 = teclado.nextInt();
		System.out.println("Dame otro número");
		num2 = teclado.nextInt();
		teclado.close();
		
		comodin = num2;
		num2 = num1;
		num1 = comodin;
			
		System.out.println(comodin);
	}
	
}
