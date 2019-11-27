package es.studium.ConversionTemperatura;

import java.util.Scanner;

public class ConversionTemperatura
{

	public static void main(String[] args)
	{
		
		int opcion;
		double cantidad;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Indique el número correspondiente a la opción del siguiente menú: \n    * MENÜ *\n    1. Pasar de Centigrado a Fahrenheit \n    2. Pasar de Fahrenheit a Centigrado \n    3. Salir ");
		opcion=teclado.nextInt();
		
		if ((opcion==1) || (opcion==2)) {
			
			System.out.println("Indique la cantidad de grados a convertir:");
			cantidad=teclado.nextDouble();
		}else if (opcion==1) {
			//System.out.println("La cantidad indicada equivale a: "+ funFahr(cantidad)+" grados Fahrenheit");
				
		}else if (opcion==2) {
			//System.out.println("La cantidad indicada equivale a:"+ funCent(cantidad));
			
		}
	}
 
}
