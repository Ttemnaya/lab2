import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {
    private StringProcessor stringProcessor;

    @Before
    public void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void whenInputCorrectValue() {
        String expected = "TestTestTestTest";
        String result = stringProcessor.CopyOfString("Test", 4);
        assertEquals(expected, result);

        String expected2 = "6 216 216 21";
        String result2 = stringProcessor.CopyOfString("6 21", 3);
        assertEquals(expected2, result2);
    }


    @Test (expected = IllegalArgumentException.class)
    public void whenInputNegativeValueThenThrowException() {
        stringProcessor.CopyOfString("Test", -4);
    }

    @Test
    public void whenInputNullValueThenThrowException() {
        boolean wasException = true;
        try {
            stringProcessor.CopyOfString("Test", 0);
        } catch (Exception e) {
            wasException = false;
        }
        assertTrue(wasException);
    }

    @Test
    public void whenInputEmptyLineThenThrowException() {
        boolean wasException = true;
        try {
            stringProcessor.CopyOfString("", 4);
        } catch (Exception e) {
            wasException = false;
        }
        assertTrue(wasException);
    }

    @Test
    public void whenInputCorrectValue2() {
        int expected = 3;
        int result = stringProcessor.CountOfOccurrences("2111244", "1");
        assertEquals(expected, result);

        int expected2 = 4;
        int result2 = stringProcessor.CountOfOccurrences("daydaydayday", "day");
        assertEquals(expected2, result2);

        int expected3 = 0;
        int result3 = stringProcessor.CountOfOccurrences("day", "1");
        assertEquals(expected3, result3);

        int expected4 =2;
        int result4 = stringProcessor.CountOfOccurrences("homework2565", "5");
        assertEquals(expected4, result4);

        int expected5 =0;
        int result5 = stringProcessor.CountOfOccurrences("", "day");
        assertEquals(expected5, result5);

        int expected6 = 3;
        int result6 = stringProcessor.CountOfOccurrences("asasasa","asa");
        assertEquals(expected6,result6);

    }

    @Test
    public void whenInputCorrectValue3() {
        String expected = "одинодиндватриодин";
        String result = stringProcessor.SymbolReplacement("11231");
        assertEquals(expected, result);

        String expected2 = "одиндваdayодин";
        String result2 = stringProcessor.SymbolReplacement("12day1");
        assertEquals(expected2, result2);

        String expected3 = "day7600";
        String result3 = stringProcessor.SymbolReplacement("day7600");
        assertEquals(expected3, result3);
    }

    @Test
    public void whenInputEmptyLineThenThrowException2() {
        boolean wasException = true;
        try {
            stringProcessor.SymbolReplacement("");
        } catch (Exception e) {
            wasException = false;
        }
        assertTrue(wasException);
    }

    @Test
    public void whenInputCorrectValue4() {
        String expected = "135";
        StringBuilder str = new StringBuilder("123456");
        StringBuilder result =stringProcessor.RemoveEverySecondSymbol(str);
        assertEquals(expected,result.toString());

    }

    @Test
    public void whenInputEmptyLineThenThrowException3() {
        StringBuilder str = new StringBuilder("");
        boolean wasException = true;
        try {
            stringProcessor.RemoveEverySecondSymbol(str);
        } catch (Exception e) {
            wasException = false;
        }
        assertTrue(wasException);
    }
}