package k04_prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n){
        List<Integer> primes = new ArrayList<>();
        if( n > 1){
            primes.add(2);
        }
        return primes;
    }

}
