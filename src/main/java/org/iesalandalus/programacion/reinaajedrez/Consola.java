package org.iesalandalus.programacion.reinaajedrez;
import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private Consola() {
		System.out.println("esto es para que no se cree el constructor por defecto :)");
	}
	public static void mostrarMenu() {
		System.out.println("Seleccione una opción \n"
				+ "1.Crear reina por defecto \n"
				+ "2.Crear reina eligiendo el color \n"
				+ "3.Mover \n"
				+ "4.Salir");
		
		
	
	}
	public static int elegirOpcionMenu() {
		int opcion;
		
		do {
			mostrarMenu();
			opcion=Entrada.entero();
		} while (opcion <1 || opcion >4);
		return opcion;
		
		}
	public static Color elegirColor() {
		int opcionColor;
		
		do {
			System.out.println("Elige: \n"
					+ "1.NEGRO \n"
					+ "2.BLANCO.");
			opcionColor= Entrada.entero();
			} while (opcionColor <1 || opcionColor>2);
		switch (opcionColor) {
			case 1:
				return Color.NEGRO;
			case 2:
				return Color.BLANCO;
			default:
				return Color.BLANCO;
			
		}
		
		
		
	}
	 public static void mostrarMenuDirecciones() {
		 System.out.println("1.NORTE\n"
		 		+ "2.NORESTE\n"
		 		+ "3.ESTE\n"
		 		+ "4.SURESTE\n"
		 		+ "5.SUR\n"
		 		+ "6.SUROESTE\n"
		 		+ "7.OESTE\n"
		 		+ "8.NOROESTE");
	 }
	public static Direccion elegirDireccion() {
		int opcionDireccion;
		
		do {
			mostrarMenuDirecciones();
			opcionDireccion= Entrada.entero();
			} while (opcionDireccion <1 || opcionDireccion>8);
		switch (opcionDireccion) {
			case 1:
				return Direccion.NORTE;
			case 2:
				return Direccion.NORESTE;
			case 3:
				return Direccion.ESTE;
			case 4:
				return Direccion.SURESTE;
			case 5:
				return Direccion.SUR;
			case 6:
				return Direccion.SUROESTE;
			case 7:
				return Direccion.OESTE;
			case 8:
				return Direccion.NOROESTE;
			default:
				return Direccion.NORTE;
		
	}}
		public static int elegirPasos() {
			int pasos;
			System.out.println("Inserte el número de pasos porfavor: ");
			pasos = Entrada.entero();
			return pasos;
			
		
		
	}
		
		public static void despedirse() {
			System.out.println("Adiós");
		}
}
