package Singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void deveRetornarBRL() {
        Moeda.getInstance().setBRL(1);
        assertEquals(1 , Moeda.getInstance().getBRL());
    }

    @Test
    public void deveRetornarUSD() {
        Moeda.getInstance().setUSD(5);
        assertEquals(5, Moeda.getInstance().getUSD());
    }


}