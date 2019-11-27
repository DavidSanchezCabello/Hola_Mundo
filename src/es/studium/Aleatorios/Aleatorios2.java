package es.studium.Aleatorios;

import java.util.Random;

public class Aleatorios2
{

	public static void main(String[] args)
	{
		Random rnd=new Random();
		int i,x;

		for (i=0;i<10;i++) {
			x=rnd.nextInt(6)+1 ;
			System.out.println(x) ; //El valor que pongamos en el nextInt() serân los números que participen
		}
	}

}
