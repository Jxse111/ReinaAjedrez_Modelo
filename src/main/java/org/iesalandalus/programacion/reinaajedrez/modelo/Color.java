package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	BLANCO, 
	NEGRO;

	private String cadenaAMostrar;

	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}

}
