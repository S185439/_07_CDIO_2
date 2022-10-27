import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto konto = new Konto();
    @Test
    void plusPenge() {
        konto.setPenge(1000);
        konto.transaktion(100);
        assertEquals(1100, konto.getPenge());
    }

    @Test
    void minusPenge() {
        konto.setPenge(1000);
        konto.transaktion(-100);
        assertEquals(900, konto.getPenge());
    }

    @Test
    void getPenge() {
        konto.setPenge(1000);
        assertEquals(1000, konto.getPenge());
    }

    @Test
    void testToString() {
        konto.setPenge(1000);
        assertEquals("1000", konto.toString());
    }
}