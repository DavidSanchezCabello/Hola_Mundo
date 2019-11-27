package es.studium.Expresion;

import java.util.Scanner;

public class Expresion
{

	public static void main(String[] args)
	{
		int a, b, c;

		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un valor para a");
		a = teclado.nextInt();
		System.out.println("Introduzca un valor para b");
		b = teclado.nextInt();
		System.out.println("Introduzca un valor para c");
		c = teclado.nextInt();
		teclado.close();

		System.out.println(formula(a,b,c));

	}
	public static double formula(int a,int b, int c) {

		double resultado = (double)((b*b)-(4*a*c))/(double)(2*a);

		return resultado;

	}

}
