package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaquinaDeCafeTest {

    @Test
    public void pruebaServirCafe() {
        Cafetera cafetera = new Cafetera(50);
        Azucarero azucar = new Azucarero(20);
        Vasos p = new Vasos(5, 3);
        Vasos m = new Vasos(5, 5);
        Vasos g = new Vasos(5, 7);

        MaquinaDeCafe maquina = new MaquinaDeCafe(cafetera, azucar, p, m, g);

        String resultado = maquina.servirCafe("pequeno", 2);
        assertEquals("Aquí tienes tu café", resultado);
    }
}
