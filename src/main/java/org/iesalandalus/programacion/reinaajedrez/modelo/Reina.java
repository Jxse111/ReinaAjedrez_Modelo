package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
    private Color color; 
    private Posicion posicion; 

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        if (color == null) {
            throw new NullPointerException("ERROR: El color no puede ser nulo."); 
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        }
        this.posicion = posicion;
    }

    public Reina() {
        color = color.BLANCO;
        posicion = new Posicion(1, 'd');
    }

    public Reina(Color color) {
        setColor(color);
        if (color == Color.BLANCO) {
            posicion = new Posicion(1, 'd');
        } else if (color == Color.NEGRO) {
            posicion = new Posicion(8, 'd');
        }
    }

    public void mover(Direccion direccion, int Pasos) throws OperationNotSupportedException {
        if (direccion == null) {
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        } else if (Pasos <= 1 || Pasos >= 7) {
            throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
        }
        switch (direccion) {

        }
    }

    @Override
    public String toString() {
        return "color=" + color + ", posicion=(" + posicion + ")";
    }

}