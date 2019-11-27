package es.studium.Aleatorios;

import java.util.Random;

public class Aleatorios5
{

	public static void main(String[] args)
	{
		Random rnd= new Random();

		System.out.println("Primera Secuencia");
		for(int i=0; i<5; i++) {
			System.out.println("\t ±"+ rnd.nextDouble());
		}
		System.out.println(""); // ¿Para qué sirve?
		System.out.println("Segunda Secuencia");
		for(int i=0;i<5;i++) {
			System.out.println("\t ±"+ rnd.nextDouble());
		}
		System.out.println("");//<-----  ¿Y esta...?
	}

}
