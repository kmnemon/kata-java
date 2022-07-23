package k05_calcstats;

import java.util.Collections;
import java.util.List;

public class CalcStats {
    private int min;
    private int max;
    private int number;
    private double average;

    public void process(List<Integer> l){
        Collections.sort(l);
        min = l.get(0);
        max = l.get(l.size()-1);
        number = l.size();
        average = (double)l.stream().reduce(0, Integer::sum) / l.size();
    }

    public int getMin(){
        return min;
    }
    public int getMax(){
        return max;
    }
    public int getNumber(){ return number;}
    public double getAvg(){ return average;}
    
}
