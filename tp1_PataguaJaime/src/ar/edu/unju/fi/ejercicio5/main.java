package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		boolean bandera = false;
		String entrada;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese numero entre 1 y 9");
			entrada = scanner.nextLine();
			bandera = validarEntero(entrada);
			if(bandera) {
				numero= Integer.parseInt(entrada);
				if(numero >= 1 && numero <=9)  {
					System.out.println("-----------------------------------------");
					System.out.println("     Tabla de multiplicar de: " + numero+ "        ");
					System.out.println("-----------------------------------------");
					for (int i = 0; i <= numero; i++) {
						
						System.out.println("\t"+numero+" x "+i+" = " + numero * i);
					}
					System.out.println("-----------------------------------------");
					System.out.println("-----------------------------------------");
				}else
				{
					System.out.println("Ingreso un numero fuera del intevalo de  1 y 9");
					bandera =false;
				}
				
			}else {
				System.out.println("Ingreso un valor INCORRECTO");
				bandera=false;
			}
		}while(!bandera);
		
	}
	//Metodo para verificar si se ingreso un numero ENTERO
		public static boolean validarEntero(String text) {
		    int v;
		    try {
		      v=Integer.parseInt(text);
		      return true;
		    } catch (NumberFormatException ex) {
		       return false;
		    }
		}
}
