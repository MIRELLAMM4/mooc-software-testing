package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void testMCDC() {
        CountLetters countLetters = new CountLetters();

        // Caso donde A es verdadero y B es falso
        int result = countLetters.count("cats!");
        Assertions.assertEquals(1, result); // Se espera 1 palabra

        // Caso donde A es falso y B es verdadero
        result = countLetters.count("dog");
        Assertions.assertEquals(0, result); // Se espera 0 palabras

        // Caso donde A es verdadero y B es verdadero
        result = countLetters.count("cats");
        Assertions.assertEquals(1, result); // Se espera 1 palabra

        // Caso donde A es falso y B es falso
        result = countLetters.count("apple!");
        Assertions.assertEquals(0, result); // Se espera 0 palabras
    }
}