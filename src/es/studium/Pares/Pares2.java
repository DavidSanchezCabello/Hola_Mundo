package es.studium.Pares;

import java.util.Scanner;

public class Pares2
{

	public static void main(String[] args)
	{
		int num1, num2, i;

		Scanner teclado= new Scanner(System.in);

		System.out.println("Introduzca un n�mero");
		num1= teclado.nextInt();
		System.out.println("Introduzca otro n�mero");
		num2= teclado.nextInt();
		i=0;
		teclado.close();

		for(i=num1; i<= num2;  i++  ) {

			if(i%2==0) {
				System.out.println("Los n�meros pares entre ellos son: "+ i);
			}
		}
	}


}
