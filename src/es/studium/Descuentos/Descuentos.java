package es.studium.Descuentos;

import java.util.Scanner;

public class Descuentos
{

	public static void main(String[] args)
	{
		int codigo,unidades;
		double precio,subtotal,total,descuento;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Indicar el código del articulo");
		codigo=teclado.nextInt();
		System.out.println("Indicar el precio del articulo");
		precio=teclado.nextDouble();
		System.out.println("Indicar el cantidad del articulo");
		unidades=teclado.nextInt();
		subtotal=unidades*precio;
		teclado.close();
		
		if (unidades > 100) {
			
			descuento=40;
			total=unidades*0.60*precio;
			
					
		}else if ((unidades >=25) && (unidades<=100)) {
			descuento=20;
			total=unidades*0.80*precio;
					
		}else if ((unidades >=10) && (unidades<=24)) {
			descuento=20;
			total=unidades*0.90*precio;
		
	}
		else
			descuento=0;
			total=unidades*precio;
			System.out.println("***********************RESUMEN COMPRA**************************");}
	
}
