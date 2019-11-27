package es.studium.Cuadrante;

import java.util.Scanner;

public class Cuadrante
{

	public static void main(String[] args)
	{
		double x, y;
		int cuadrante;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un valor para la coordenada x");
		x = teclado.nextDouble();
		System.out.println("Introduzca un valor para la coordenada x");
		y = teclado.nextDouble();
		cuadrante = funCuadrante(x, y);
		teclado.close();
		System.out.println("El punto dado pertenece al cuadrante nº."+ cuadrante);
	}

	public static int funCuadrante(double x, double y)
	{

		int c;

		if ((x >= 0) && (y >= 0))
		{
			c = 1;

		} 
		else if ((x >= 0) && (y <= 0))
		{
			c = 4;
		} 
		else if ((x <= 0) && (y >= 0))
		{
			c = 2;
		} 
		else
		{
			c = 3;
		}
		return c;
	}
}
