package k05_calcstats;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalcStatsTest {
    private CalcStats calcStats;

    @BeforeAll
    private void setUp(){
        calcStats = new CalcStats();
        calcStats.process(Arrays.asList(6,9,15,-2,92,11));
    }

    @Test
    public void testMinimum(){
        assertEquals(-2, calcStats.getMin());
    }

    @Test
    public void testMax(){
        assertEquals(92, calcStats.getMax());
    }

    @Test
    public void testNumber(){
        assertEquals(6, calcStats.getNumber());
    }

    @Test
    public void testAvg(){
        assertEquals(21.833333333333332, calcStats.getAvg());
    }


}
