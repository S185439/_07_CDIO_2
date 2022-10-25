import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RaflebaegerTest {
        Raflebaeger raflebaeger = new Raflebaeger();
        @Test
        void slaaAlleTerninger() {
            for (int t = 0; t < 10; t++) {
                int tempSum = raflebaeger.slaaAlleTerninger();
                assertTrue(tempSum >= 1 && tempSum <= 12);
            }
        }

        @Test
        void getSumAfTerninger() {
            int tempSum = raflebaeger.slaaAlleTerninger();
            assertEquals(tempSum, raflebaeger.getSumAfTerninger());
        }
}