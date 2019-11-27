package es.studium.Peaje;

import java.util.Scanner;

public class Peaje
{

	public static void main(String[] args)
	{
		double km, ton;
		
		String vehiculo, moto, coche, camion, autobus;
		String tipovehiculo = "moto,coche,camion,autobus";
		Scanner teclado= new Scanner(System.in);
		System.out.println("Indicar el tipo de vehículo"+tipovehiculo);
		vehiculo = teclado.nextLine();
		System.out.println("Indicar los kilometros recorridos");
		km=teclado.nextDouble();
		
		switch (vehiculo) {
		case "moto":
				System.out.println("La cantidad a pagar es de 3,2€");
				break;
		case "coche":
				System.out.println("La cantidad a pagar es de"+ (0.1*km+ "€"));
				break;
		case "camion":
				System.out.println("Indicar las toneladas transportadas");
				ton = teclado.nextDouble();
				System.out.println("La cantidad a pagar es de " + ((0.1*km)+(0.1*ton)+"€"));
				break;
		case "autobus":
				System.out.println("La cantidad a pagar es de" + ((0.2*km)+"€"));
				break;
		default:
			
				System.out.println("Datos indicados incorrectos");
				break;
				
			
		}
		

	}

}
