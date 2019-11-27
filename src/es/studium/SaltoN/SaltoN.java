package es.studium.SaltoN;

import java.util.Scanner;

public class SaltoN
{

	public static void main(String[] args)
	{
		int salto;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Indique el valor del salto entre números");
		salto = teclado.nextInt();
	for (int i=0;i <=1000;i++) {
		
		if (i%salto==0) {
			System.out.println(i);
		}
	}

	}

}
