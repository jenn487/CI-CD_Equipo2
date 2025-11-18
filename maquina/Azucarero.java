package maquina;

public class Azucarero {

    private int cucharadas;

    public Azucarero(int cucharadas) {
        this.cucharadas = cucharadas;
    }

    public boolean hayAzucar(int cantidad) {
        return cucharadas >= cantidad;
    }

    public void usarAzucar(int cantidad) {
        if (hayAzucar(cantidad)) {
            cucharadas -= cantidad;
        }
    }

    public int getCucharadas() {
        return cucharadas;
    }
}
