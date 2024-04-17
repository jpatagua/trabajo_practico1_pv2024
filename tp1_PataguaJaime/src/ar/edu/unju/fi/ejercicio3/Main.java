package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese numero: ");
		numero = scanner.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("El numero "+numero+ " es PAR "+"\n"+
								"El triplo de "+numero +" = " + numero*3);
		}else 
		{
			System.out.println("El numero "+numero+ " es IMPAR "+"\n"+
					"El doble de "+numero +" = " + numero*2);
		}
		
		scanner.close();
	}

}
