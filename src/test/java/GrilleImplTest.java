import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class GrilleImplTest {

    @Test
    public void testOK() {
        assertEquals( 4, GrilleImpl.getDimension(12, 16));
        assertEquals( 8, Pgcd.pgcd(24, 16));
        assertEquals( 9, Pgcd.pgcd( 9, 27));
        assertEquals(10, Pgcd.pgcd( 0, 10));
        assertEquals( 0, Pgcd.pgcd( 0, 0));
    }
}