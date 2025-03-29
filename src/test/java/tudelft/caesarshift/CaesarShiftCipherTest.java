package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testShiftPositive() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.caesarShiftCipher("abc", 3));
    }

    @Test
    public void testShiftNegative() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.caesarShiftCipher("abc", -3));
    }

    @Test
    public void testShiftWrapAround() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("zab", cipher.caesarShiftCipher("xyz", 2));
    }

    @Test
    public void testShiftZero() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("hello", cipher.caesarShiftCipher("hello", 0));
    }

    @Test
    public void testInvalidCharacter() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.caesarShiftCipher("hello world", 3));
    }

    @Test
    public void testEmptyString() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("", cipher.caesarShiftCipher("", 5));
    }

    @Test
    public void testNullString() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.caesarShiftCipher(null, 5));
    }
}
