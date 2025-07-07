package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        if(numbers.size()>0){

            Float average = 0f;
            Float sum = 0f;
            Float min = Float.MAX_VALUE;
            Float max = Float.MIN_VALUE;

            for (int n = 0; n < numbers.size(); n++) {
                Float cur = numbers.get(n);
                sum += cur;
                if(cur < min){
                     min = cur;
                } else if (cur > max) {
                    max = cur;
                }
            }
            average = sum/numbers.size();
            return new Stats(average,min,max);
        }else{
            return new Stats(Float.NaN,Float.NaN,Float.NaN);
        }
    }

     static class Stats {
         Float average;
         Float min;
         Float max;

         public Stats(Float average, Float min, Float max) {
             this.average = average;
             this.min = min;
             this.max = max;
         }
     }
}
