import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class SpillePladeTest {

    SpillePlade sP = new SpillePlade();


    @Test
    void rykTilFelt() {
        Felt f1 = sP.rykTilFelt(2);
        assertEquals("Tower", f1.navn);
        f1 = sP.rykTilFelt(7);
        assertEquals(0, f1.transaktionsVaerdi);
        f1 = sP.rykTilFelt(12);
        assertEquals("Du er landet på Goldmine og 650 kr. er tilføjet til din konto", f1.outputTekst);
        f1 = sP.rykTilFelt(26);
        assertEquals("Fejl", f1.navn);
    }
}