package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		String entrada;
		Scanner scanner = new Scanner(System.in);
		boolean bandera;
		do {
			System.out.print("Ingrese un numero: ");
			entrada = scanner.nextLine();
			bandera = verificarEntero(entrada);
			if (bandera){
				numero = Integer.parseInt(entrada);
				if(numero >= 0 && numero <=10)  {
					System.out.println("El factorial de "+numero+" = "+calularFactorial(numero));
				}else
				{
					System.out.println("El numero ingresado tiene que estar entre 0 y 10");
					bandera =false;
				}
			}else {
				System.out.println("Ingreso un valor Incorrecto");
			}
		}while(!bandera);
		
		scanner.close();
		
	}
	
	//Metodo para calcular el factorial de un numero 
	public static int calularFactorial(int numero) {
		int factorial =1;
		int contador = 1;
		while(contador <= numero) {
			factorial *= contador;
			contador++;
		}
		return factorial;
	}
	//Metodo para verificar si se ingreso un numero ENTERO
	public static boolean verificarEntero(String text) {
	    int v;
	    try {
	      v=Integer.parseInt(text);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}

	
	 
	
}
