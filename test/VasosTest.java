package maquina;

import static org.junit.Assert.*;
import org.junit.Test;

public class VasosTest {

    @Test
    public void pruebaHayVasos() {
        Vasos vasos = new Vasos(5, 3);
        assertTrue(vasos.hayVasos(1));
    }
}
