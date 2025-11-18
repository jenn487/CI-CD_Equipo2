package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class CafeteraTest {

    @Test
    public void pruebaHayCafe() {
        Cafetera cafetera = new Cafetera(10);
        assertTrue(cafetera.hayCafe(5));
    }
}


