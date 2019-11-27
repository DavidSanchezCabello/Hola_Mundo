package es.studium.SaltoN;

import java.util.Scanner;

public class SaltoNbis
{

	public static void main(String[] args)
	{
		int salto;
		int i;
	
		Scanner teclado= new Scanner(System.in);
		System.out.println("Indique el valor del salto entre números");
		salto = teclado.nextInt();
		if (salto==0) {
				System.out.println("El número debe ser distinto de cero");
			}else
			{
				for ( i=0;i <=1000;  i+= salto) {
				
					System.out.println(i);
				
			}
			
		}
	}

}
