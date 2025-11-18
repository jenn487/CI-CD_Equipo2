package maquina;

public class Vasos {

    private int cantidad;
    private int tamano; // en onzas

    public Vasos(int cantidad, int tamano) {
        this.cantidad = cantidad;
        this.tamano = tamano;
    }

    public boolean hayVasos(int cantidadSolicitada) {
        return cantidad >= cantidadSolicitada;
    }

    public void usarVaso() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTamano() {
        return tamano;
    }
}
