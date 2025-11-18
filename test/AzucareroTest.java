package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class AzucareroTest {

    @Test
    public void pruebaHayAzucar() {
        Azucarero azucar = new Azucarero(10);
        assertTrue(azucar.hayAzucar(2));
    }
}
