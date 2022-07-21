package k04_prime_factors;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void testOne(){
        assertEquals(list(), PrimeFactors.generate(1));
    }

    @Test
    public void testTwo(){
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    private List<Integer> list(int... ints){
        List<Integer> list = new ArrayList<>();
        for(int i: ints){
            list.add(i);
        }
        return list;
    }
}
