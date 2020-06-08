package StringCalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator;
    Map<String, Integer> preCalculatedResults;
    private static final String VALID_INPUT_STRING = "1,2";
    private static final String VALID_INPUT_STRING_ONE_ARGUMENT = "1";
    private static final String EMPTY_STRING = "";

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
        preCalculatedResults = new HashMap<String, Integer>() {{
            put(VALID_INPUT_STRING, 3);
            put(VALID_INPUT_STRING_ONE_ARGUMENT, 1);
            put(EMPTY_STRING, 0);
        }};
    }

    @Test
    public void add_HappyCase() {
        test(VALID_INPUT_STRING);
    }

    @Test
    public void add_HappyCase_OneArgument() {
        test(VALID_INPUT_STRING_ONE_ARGUMENT);
    }

    @Test
    public void add_HappyCaseNoArguments() {
        test(EMPTY_STRING);
    }

    private void test(String input) {
        int result = stringCalculator.Add(input);
        if (preCalculatedResults.get(input) == null) {
            Assert.fail("Input doesn't has pre calculated result!");
        }
        Assert.assertEquals(result, preCalculatedResults.get(input).intValue());
    }
}