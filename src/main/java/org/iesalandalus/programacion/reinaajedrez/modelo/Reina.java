package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo");// No se sabe si es correcto.
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");// No se sabe si es
																								// correcto.
		}
		this.posicion = posicion;
	}

	public Reina() {
		color = color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	public Reina(Color color) {
		if (color == Color.NEGRO) {
			posicion = new Posicion(1, 'd');
			reinaBlanca = new Reina(Color.BLANCO);
			this.color = color;
		} else if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'd');
			reinaNegro = new Reina(Color.NEGRO);
			this.color = color;
		}
	}

	public void mover(Direccion direccion, int Pasos)  throws OperationNotSupportedException {
		if  (direccion == null) {
			throw new NullPointerException("Los pasos no pueden ser nulos");
		}else if (Pasos <= 1 && Pasos >= 7 ){
			throw new OperationNotSupportedException("Los pasos salen del tablero");
		}}

	@Override
	public String toString() {
		return String.format("Reina [color=%s, posicion=%s]", color, posicion);
	}

}