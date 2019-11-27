package es.studium.Ordena3numeros;

import java.util.Scanner;

public class Ordena3numeros
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

		if ((a>b)&&(b>c)) {

			System.out.println("el orden de mayor a menor es: " + " primero " + a + " segundo " + b +  " tercero " + c);
		}
		else if ((b>a)&&(a>c))
		{
			System.out.println("el orden de mayor a menor es: " + " primero " + b + " segundo " + a + " tercero " + c);
		}
		else if ((c>a)&&(a>b))
		{
			System.out.println("el orden de mayor a menor es: " + " primero " + c + " segundo " + a + " tercero " + b);
		}
		else if ((c>b)&&(b>a))
		{
			System.out.println("el orden de mayor a menor es: " + " primero " + c + " segundo " + b + " tercero " + a);
		}
		else if ((a>c)&&(c>b))
		{
			System.out.println("el orden de mayor a menor es: " + " primero " + a + " segundo " + c + " tercero " + b);
		}
		else 
		{
			System.out.println("el orden de mayor a menor es: " + " primero " + b + " segundo " + c + " tercero " + a);
		}
	}
}
