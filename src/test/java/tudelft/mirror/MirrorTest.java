package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MirrorTest {

    @Test
    void testMirrorEnds() {
        Mirror mirror = new Mirror();

        // Caso 1: Cadena con extremo reflejado
        assertEquals("ab", mirror.mirrorEnds("abXYZba")); // El extremo reflejado es "ab"

        // Caso 2: Cadena con un solo carácter reflejado
        assertEquals("a", mirror.mirrorEnds("abca")); // El extremo reflejado es "a"

        // Caso 3: Cadena que es completamente reflejada
        assertEquals("aba", mirror.mirrorEnds("aba")); // El extremo reflejado es "aba"

        // Caso 4: Cadena vacía
        assertEquals("", mirror.mirrorEnds("")); // No hay extremos reflejados

        // Caso 5: Cadena con un solo carácter
        assertEquals("a", mirror.mirrorEnds("a")); // El extremo reflejado es "a"

        // Caso 6: Cadena con múltiples caracteres reflejados
        assertEquals("abc", mirror.mirrorEnds("abcXYZcba")); // El extremo reflejado es "abc"
    }
}
