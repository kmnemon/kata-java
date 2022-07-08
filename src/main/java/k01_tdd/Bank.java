package k01_tdd;

import java.util.HashMap;

public class Bank {
    private HashMap<Pair, Integer> rates = new HashMap<>();

    Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }

    int rate(String from, String to){
        if(from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }

    void addRate(String from, String to, int rate){
        rates.put(new Pair(from, to), rate);
    }

    private class Pair {
        private String from;
        private String to;

        Pair(String from, String to){
            this.from = from;
            this.to = to;
        }

        public boolean equals(Object o){
            Pair pair = (Pair) o;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        public int hashCode(){
            return 0;
        }
    }
}

