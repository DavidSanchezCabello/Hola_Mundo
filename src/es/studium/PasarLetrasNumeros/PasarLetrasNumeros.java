package es.studium.PasarLetrasNumeros;

import java.util.Scanner;

public class PasarLetrasNumeros
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		char letra;
		letra = 'a';
		int numero = 0;

		System.out.println("Introduzca una letra");
		letra = teclado.next().charAt(0);

		if (letra != '*')
		{

			switch (letra)
			{

			case 'a':
				numero = 65;
				break;
			case 'b':
				numero = 66;
				break;
			case 'c':
				numero = 67;
				break;
			case 'd':
				numero = 68;
				break;
			case 'e':
				numero = 69;
				break;
			case 'f':
				numero = 70;
				break;
			case 'g':
				numero = 71;
				break;
			case 'h':
				numero = 72;
				break;
			case 'i':
				numero = 73;
				break;
			case 'j':
				numero = 74;
				break;
			case 'k':
				numero = 75;
				break;
			case 'l':
				numero = 76;
				break;
			case 'm':
				numero = 77;
				break;
			case 'n':
				numero = 78;
				break;
			case 'ñ':
				numero = 79;
				break;
			case 'o':
				numero = 80;
				break;
			case 'p':
				numero = 81;
				break;
			case 'q':
				numero = 82;
				break;
			case 'r':
				numero = 83;
				break;
			case 's':
				numero = 84;
				break;
			case 't':
				numero = 85;
				break;
			case 'u':
				numero = 86;
				break;
			case 'v':
				numero = 87;
				break;
			case 'w':
				numero = 88;
				break;
			case 'x':
				numero = 89;
				break;
			case 'y':
				numero = 90;
				break;
			case 'z':
				numero = 91;

			default:

				System.out.println("El caracter intrtoducido no es correcto");
				break;
			}

			System.out.println("La letra indicada pertenece al número en ASCII" + " " + numero);
		}
		teclado.close();

	}
}
