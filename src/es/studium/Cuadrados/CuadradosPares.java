package es.studium.Cuadrados;

public class CuadradosPares
{

	public static void main(String[] args)
	{
		int i, resultado;
		System.out.println("Los cuadrados de los pares entre 1 y 100 son: " );

		for (i = 0; i <= 100; i++)
		{

			if (i % 2 == 0)
			{
				resultado = calcular(i);
				System.out.println( resultado);
			}
		}

	}

	public static int calcular(int i)
	{

		return (i * i);

	}

}
