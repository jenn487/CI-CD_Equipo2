package maquina;

public class MaquinaDeCafe {

    private Cafetera cafetera;
    private Azucarero azucarero;
    private Vasos vasosPequenos;
    private Vasos vasosMedianos;
    private Vasos vasosGrandes;

    public MaquinaDeCafe(Cafetera cafetera, Azucarero azucarero,
                         Vasos vasosPequenos, Vasos vasosMedianos, Vasos vasosGrandes) {

        this.cafetera = cafetera;
        this.azucarero = azucarero;
        this.vasosPequenos = vasosPequenos;
        this.vasosMedianos = vasosMedianos;
        this.vasosGrandes = vasosGrandes;
    }

    public String servirCafe(String tamano, int cucharadas) {

        Vasos vaso = null;

        switch (tamano.toLowerCase()) {
            case "pequeno":
                vaso = vasosPequenos;
                break;
            case "mediano":
                vaso = vasosMedianos;
                break;
            case "grande":
                vaso = vasosGrandes;
                break;
            default:
                return "Tamaño inválido";
        }

        if (!vaso.hayVasos(1)) return "No hay vasos";
        if (!cafetera.hayCafe(vaso.getTamano())) return "No hay café suficiente";
        if (!azucarero.hayAzucar(cucharadas)) return "No hay azúcar";

        vaso.usarVaso();
        cafetera.usarCafe(vaso.getTamano());
        azucarero.usarAzucar(cucharadas);

        return "Aquí tienes tu café";
    }
}
