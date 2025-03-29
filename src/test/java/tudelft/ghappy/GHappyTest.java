package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    @Test
    public void testAllHappyGs() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("gggg"));
    }

    @Test
    public void testSingleG() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("g"));
    }

    @Test
    public void testGAtStart() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("gabc"));
    }

    @Test
    public void testGAtEnd() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("abcg"));
    }

    @Test
    public void testGSeparated() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("agbgc"));
    }

    @Test
    public void testGCluster() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("aggga"));
    }

    @Test
    public void testEmptyString() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy(""));
    }

    @Test
    public void testNoG() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("abc"));
    }
}
