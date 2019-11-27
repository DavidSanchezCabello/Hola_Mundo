package es.studium.Aleatorios;

import java.util.Random;

public class Aleatorios6
{

	public static void main(String[] args)
	{
		Random rnd= new Random();
		rnd.setSeed(3816);
		System.out.println("Primera Secuencia");
		for (int i=0;i<5;i++) {
			System.out.println("\t ± " +rnd.nextDouble());
		}
		System.out.println("");

		rnd.setSeed(3816);
		System.out.println("Segunda Secuencia");

		for(int i=0; i<5;i++) {
			System.out.println("\t ± " + rnd.nextDouble() );
		}
		System.out.println("");
	}


}
