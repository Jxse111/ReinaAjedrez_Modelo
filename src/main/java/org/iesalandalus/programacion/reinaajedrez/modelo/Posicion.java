package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		if (fila >= 1 && fila <= 8) {
			this.fila = fila;
		} else {
			throw new IllegalArgumentException("Se ha salido de la casilla");
		}
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		if (columna >= 'a' && columna <= 'h') {
			this.columna = columna;
		} else {
			throw new IllegalArgumentException("Se ha salido de la casilla");
		}

	}

	public Posicion(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
		setFila(fila);
		setColumna(columna);
	}
	public Posicion(Posicion posicion) {
	fila=posicion.getFila();
	columna=posicion.getColumna();
	}
}
