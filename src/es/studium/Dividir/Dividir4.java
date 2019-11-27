package es.studium.Dividir;

import java.util.Scanner;

public class Dividir4
{

	public static void main(String[] args)
	{
		int num1, num2;
		double resultado;


		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca el numerador");
		num1=teclado.nextInt();
		System.out.println("Introduzca el denominador");
		num2=teclado.nextInt();
		resultado=dividir(num1,num2);
		System.out.println("La división es: " + resultado);
		teclado.close();

	}
	public static double dividir(int a, int b) {

		double division;
		division=((double) a / (double) b);
		return (division);

	}

}
