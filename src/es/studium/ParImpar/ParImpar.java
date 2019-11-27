package es.studium.ParImpar;

import java.util.Scanner;

public class ParImpar
{

	public static void main(String[] args)
	{
		int num1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame un número");
		num1 = teclado.nextInt();
		if  (num1%2 ==0) 
		{	System.out.println("El número es PAR");
		
		}
		else 
		{
			System.out.println("El número es IMPAR");
		}
		teclado.close();
		}
	
		
}
