import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class SpillePladeTest {

    SpillePlade sP = new SpillePlade();

    @Test
    void rykTilFelt() {

        Felt f1 = sP.rykTilFelt(2);
        assertEquals("Tower", f1.navn);
    }
}