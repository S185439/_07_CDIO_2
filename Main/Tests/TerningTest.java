import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TerningTest {

    Terning terning = new Terning();;

    @Test
    void slaaTerninger() {
        for (int t = 0; t < 5; t++) {
            int tempOejenVaerdi = terning.slaaTerning();
            assertTrue(tempOejenVaerdi >= 1 && tempOejenVaerdi <= 6);
        }
    }

    @Test
    void getOejenVaerdi() {
        assertEquals(1, terning.getOejenVaerdi());
        terning.setOejenVaerdi(5);
        assertEquals(5, terning.getOejenVaerdi());
    }

    @Test
    void setOejenVaerdi() {
        terning.setOejenVaerdi(4);
        assertEquals(4, terning.setOejenVaerdi(-3));
        assertEquals(4, terning.setOejenVaerdi(7));
        assertEquals(4, terning.setOejenVaerdi(0));
        assertEquals(3, terning.setOejenVaerdi(3));
    }

    @Test
    void testToString() {
        terning.setOejenVaerdi(4);
        assertEquals("4", terning.toString());
    }
}