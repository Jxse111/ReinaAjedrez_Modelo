package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	@Override
	public String toString() {
		return String.format("Posicion [fila=ValorFila, columna=ValorColumna]", fila, columna);
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

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
		fila = posicion.getFila();
		columna = posicion.getColumna();
		
		
	}
	
}
