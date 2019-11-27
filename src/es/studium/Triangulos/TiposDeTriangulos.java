package es.studium.Triangulos;

import java.util.Scanner;

public class TiposDeTriangulos
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		int lado1, lado2, lado3;

		System.out.println("Dame la longitud del lado 1");
		lado1 = teclado.nextInt();
		System.out.println("Dame la longitud del lado 2");
		lado2 = teclado.nextInt();
		System.out.println("Dame la longitud del lado 3");
		lado3 = teclado.nextInt();
		teclado.close();

		if ((lado1 == lado2) && lado2 == lado3)
		{
			System.out.println("El triángulo formado es equilatero");
		} else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3))
		{
			System.out.println("El triángulo formado es escaleno");
		} else
		{
			System.out.println("El triángulo formado es isosceles");
		}
	}

}
