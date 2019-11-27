package es.studium.Cuadrados;

public class Cuadrados
{

	public static void main(String[] args)
	{
		System.out.println("La suma de los cuadrados de los 100 primeros números es: " + SumaCuadrados());

	}

	public static double SumaCuadrados()
	{
		int resultado, i;
		resultado = 0;
		for (i = 0; i <= 99; i++)
		{

			resultado = resultado + (i * i);

		}
		return resultado;
	}
}
