package es.studium.Meses;

import java.util.Scanner;

public class Meses
{

	public static void main(String[] args)
	{
		int mes;
		//int i;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el n�mero del mes buscado");
		mes = teclado.nextInt();
		teclado.close();

		switch (mes)
		{

		case 1: //mes==1
			System.out.println("El mes equivalente al n�mero " + mes + " es Enero");
			break;
		case 2: //mes==2
			System.out.println("El mes equivalente al n�mero " + mes + " es Febrero");
			break;
		case 3: //mes==3
			System.out.println("El mes equivalente al n�mero " + mes + " es Marzo");
			break;
		case 4: //mes==4
			System.out.println("El mes equivalente al n�mero " + mes + " es Abril");
			break;
		case 5: //mes==5
			System.out.println("El mes equivalente al n�mero " + mes + " es Mayo");
			break;
		case 6: //mes==6
			System.out.println("El mes equivalente al n�mero " + mes + "es Junio");
			break;
		case 7: //mes==7
			System.out.println("El mes equivalente al n�mero " + mes + " es Julio");
			break;
		case 8: //mes==8
			System.out.println("El mes equivalente al n�mero " + mes + " es Agosto");
			break;
		case 9: //mes==9
			System.out.println("El mes equivalente al n�mero " + mes + " es Septiembre");
			break;
		case 10: //mes==10
			System.out.println("El mes equivalente al n�mero " + mes +" es Octubre");
			break;
		case 11: //mes==11
			System.out.println("El mes equivalente al n�mero " + mes + " es Noviembre");
			break;
		case 12: //mes==12
			System.out.println("El mes equivalente al n�mero " + mes + " es Diciembre"); 

			break;
		default: //mes== por defecto
			System.out.println("El n�mero " + mes + " no pertenece a ning�n mes");
			break;


		}

	}

}
