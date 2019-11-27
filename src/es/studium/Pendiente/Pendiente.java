package es.studium.Pendiente;

import java.util.Scanner;

public class Pendiente
{

	public static void main(String[] args)
	{
		int x1, x2, y1, y2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el valor de x1");
		x1 = teclado.nextInt();
		System.out.println("Introduzca el valor de x2");
		x2 = teclado.nextInt();
		System.out.println("Introduzca el valor de y1");
		y1 = teclado.nextInt();
		System.out.println("Introduzca el valor de y2");
		y2 = teclado.nextInt();
		teclado.close();
		procPendiente(x1, x2, y1, y2);
	}

	public static void procPendiente(float x1, float x2, float y1, float y2)
	{

		float m;

		m = (y2 - y1) / (x2 - x1);

		System.out.println("La pendiente entre los dos puntos indicados es: " + m);

	}
}
