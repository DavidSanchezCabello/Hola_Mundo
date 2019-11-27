package es.studium.Pares;

import java.util.Scanner;

public class Pares2
{

	public static void main(String[] args)
	{
		int num1, num2, i;

		Scanner teclado= new Scanner(System.in);

		System.out.println("Introduzca un número");
		num1= teclado.nextInt();
		System.out.println("Introduzca otro número");
		num2= teclado.nextInt();
		i=0;
		teclado.close();

		for(i=num1; i<= num2;  i++  ) {

			if(i%2==0) {
				System.out.println("Los números pares entre ellos son: "+ i);
			}
		}
	}


}
