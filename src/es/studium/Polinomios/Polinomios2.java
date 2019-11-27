package es.studium.Polinomios;

import java.util.Scanner;

public class Polinomios2
{

	public static void main(String[] args)
	{
		int x, i; // j, k, a, b, c, d, e, f, g, h;
		int coeficiente = 0;
		double solucion;
		solucion = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indique el valor de x: ");
		x = teclado.nextInt();

		for (i = 10; i >= 0; i--)
		{

			System.out.println("Indique el valor del coeficiente de x elevado a: " + i);
			coeficiente = teclado.nextInt();
			solucion += coeficiente * Math.pow(x, i);
		}
		System.out.println("El resultado del polinomio es:" + solucion);
		teclado.close();

		/*
		 * System.out.println("Indique el valor del coeficiente de x elevado a 10: "); a
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 9: "); b
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 8: "); c
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 7: "); d
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 6: "); e
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 5: "); f
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 4: "); g
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 3: "); h
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 2: "); i
		 * = teclado.nextInt();
		 * System.out.println("Indique el valor del coeficiente de x elevado a 1: "); j
		 * = teclado.nextInt();
		 * 
		 * 
		 * System.out.println("El resultado del polinomio es: " + a * Math.pow(x, 10) +
		 * b * Math.pow(x, 9) + c * Math.pow(x, 8) + d * Math.pow(x, 7) + e *
		 * Math.pow(x, 6) + f * Math.pow(x, 5) + g * Math.pow(x,4) + h * Math.pow(x, 3)
		 * + i * Math.pow(x, 2) + j * Math.pow(x,1) + k);
		 */
	}

}
