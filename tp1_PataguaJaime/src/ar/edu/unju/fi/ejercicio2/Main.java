package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pais;
		short edad;
		double alturaEdificio;
		double precioProducto;
		String numeroTelefono;
		double coseno;
		
		pais = "Argentina";
		edad = 18;
		alturaEdificio = 400;
		precioProducto = 599.20;
		numeroTelefono = "3885426879";
		coseno = Math.cos(0.5);
		
		System.out.println("Pais: "+ pais +"\n"+
							"Edad: "+ edad + "\n"+
							"Altura Edificio: "+ alturaEdificio +"\n"+
							"Precio Producto: "+ precioProducto +"\n"+
							"Numero Telefono: "+ numeroTelefono +"\n"+
							"Coseno(0.5) : "+ coseno +"\n");
	}

}
