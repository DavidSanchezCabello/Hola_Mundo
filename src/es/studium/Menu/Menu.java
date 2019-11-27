package es.studium.Menu;

import java.util.Scanner;

public class Menu
{

	public static void main(String[] args)
	{
		int opcion;

		Scanner teclado= new Scanner(System.in);



		do {
			System.out.println("Indique el número correspondiente a la opción del siguiente menú: \n    * MENÜ *\n    1.Abrir \n    2.Cerrar \n    3.Modificar \n    4.Salir");
			opcion=teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("La opción elegida es Abrir");
				break;

			case 2:
				System.out.println("La opción elegida es Cerrar");
				break;
			case 3:
				System.out.println("La opción elegida es Modificar");
				break;
			case 4:
				System.out.println("La opción elegida es Cerrar");
				break;
			default:
				System.out.println("La opción elegida no es correcta");
				break;

			}

		}while (opcion !=4);
		teclado.close();

	}

}
