import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpillerTest {

    Spiller spiller = new Spiller("testSpiller");

    @Test
    void setSpillerNavn() {
        spiller.setSpillerNavn("testSpiller1");
        assertEquals("testSpiller1", spiller.getSpillerNavn());
    }

    @Test
    void getSpillerNavn() {
        spiller.setSpillerNavn("testSpiller");
        assertEquals("testSpiller", spiller.getSpillerNavn());
    }
}