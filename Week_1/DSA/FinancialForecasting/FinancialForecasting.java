package FinancialForecasting;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
 
        if (years == 0) {
            return initialValue;
        }
 
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        
        double result = calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
       
        memo.put(years, result);
        return result;
    }

    public static void main(String[] args) {
        double initialValue = 1000; 
        double growthRate = 0.05; 
        int years = 10; 

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.println("The predicted future value after " + years + " years is: " + futureValue);
    }
}
