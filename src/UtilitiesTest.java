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
        assertArrayEquals(new char[]{'e', 'l'}, utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2));
    }

    @Test
    void everyNthChar_largeN() {
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 6));
    }

    @Test
    void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
    }
    @Test
    void removePairs_empty() {
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    void removePairs_null() {
        assertNull(utilities.removePairs(null));
    }
    @Test
    void removePairs_minimal() {
        assertEquals("f", utilities.removePairs("ff"));
    }

    @Test
    void removePairs_single() {
        assertEquals("1", utilities.removePairs("1"));
    }



    @Test
    void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("lance"));
        assertNotNull(utilities.nullIfOddLength("mike"));
    }
}