package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsTest {
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "1,1,5,0", "1,1,6,1", "1,1,7,-1", "1,1,8,-1" })
    public void totalIsTooBig(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "1,4,9,-1", "0,3,15,-1", "0,1,5,-1", "0,4,20,-1" })
    public void onlyBigBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({
        "0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2",
        "0,3,12,-1", "1,3,12,-1", "2,3,12,2", "3,3,12,2"})
    public void bigAndSmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "3,6,2,6", "2,4,3,5", "3,2,4,-1", "8,3,5,-1" })
    public void onlySmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
}
