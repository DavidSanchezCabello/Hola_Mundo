package es.studium.ParImpar;

import java.util.Scanner;

public class ParImpar3
{

	public static void main(String[] args)
	{
		int numero;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero=teclado.nextInt();
		
		if(numero%2==0) {
			
			System.out.println("El número es par");
		}else
			System.out.println("El número es impar");
		teclado.close();

	}

}
