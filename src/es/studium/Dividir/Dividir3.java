package es.studium.Dividir;

import java.util.Scanner;

public class Dividir3
{

	public static void main(String[] args)
	{
		int dividendo, divisor ;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el dividendo");
		dividendo=teclado.nextInt();
		System.out.println("Introduzca un divisor");
		divisor=teclado.nextInt();

		System.out.println("La división vale" + dividir(dividendo,divisor));
		teclado.close();
	}

	public static double dividir  (int a,int b) {

		double resultado;
		resultado=((double)a/(double)b);
		return  resultado;



	}

}
