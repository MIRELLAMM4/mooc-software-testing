package tudelft.sum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

class TwoNumbersSumTest {

    @Test
    void testAddTwoNumbers() {
        TwoNumbersSum solution = new TwoNumbersSum();

        // Caso de prueba 1
        ArrayList<Integer> first = new ArrayList<>();
        first.add(2);
        first.add(4);
        first.add(3); // Representa el número 342

        ArrayList<Integer> second = new ArrayList<>();
        second.add(5);
        second.add(6);
        second.add(4); // Representa el número 465

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(8);
        expected.add(0);
        expected.add(8); // El resultado debe ser 807

        assertEquals(expected, solution.addTwoNumbers(first, second));

        // Caso de prueba 2: con un número que lleva un 1 extra
        first.clear();
        first.add(9);
        first.add(9);
        first.add(9); // Representa el número 999

        second.clear();
        second.add(1); // Representa el número 1

        expected.clear();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(1); // El resultado debe ser 1000

        assertEquals(expected, solution.addTwoNumbers(first, second));
    }
}
