import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {
    private Utilities utilities;
    @BeforeEach
    void setup() {
        utilities = new Utilities();
    }

    @Test
    void everyNthChar() {
        fail("This is a stub methodTest");
    }

    @Test
    void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
    }

    @Test
    void converter() {
        fail("This is a stub methodTest");
    }

    @Test
    void nullIfOddLength() {
        fail("This is a stub methodTest");
    }
}