package statisticker;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class StatisticsTest 
{
    @Test
    public void reportsAverageMinMaxx()
    {
        Float[] numbers = {1.5f, 8.9f, 3.2f, 4.5f};
        List<Float> numberList = Arrays.asList(numbers);

        Statistics.Stats s= Statistics.getStatistics(numberList);

        float epsilon = 0.001f;
        assertEquals(s.average, 4.525f, epsilon);
        assertEquals(s.min, 1.5f, epsilon);
        assertEquals(s.max, 8.9f, epsilon);
    }
    @Test
    public void reportsNaNForEmptyInput()
    {
        List<Float> emptyList = new ArrayList<Float>();

        Statistics.Stats s = Statistics.getStatistics(emptyList);
        assertEquals(s.average, Float.NaN,0.001f);
        assertEquals(s.min,  Float.NaN,0.001f);
        assertEquals(s.max,  Float.NaN,0.001f);

        // All fields of computedStats (average, max, min) must be
        // Float.NaN (not-a-number), as described in
        // https://www.geeksforgeeks.org/nan-not-number-java/
        // Specify the asserts here and implement accordingly.
    }
}
