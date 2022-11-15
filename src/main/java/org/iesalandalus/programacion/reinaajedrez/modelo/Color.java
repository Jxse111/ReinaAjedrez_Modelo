package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	BLANCO, 
	NEGRO;

	private String cadenaAMostrar;

	private void Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}

}
