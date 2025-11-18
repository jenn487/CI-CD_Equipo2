package maquina;

public class Cafetera {

    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hayCafe(int cantidad) {
        return cantidadCafe >= cantidad;
    }

    public void usarCafe(int cantidad) {
        if (hayCafe(cantidad)) {
            cantidadCafe -= cantidad;
        }
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }
}
