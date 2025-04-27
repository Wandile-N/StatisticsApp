package com.example.statistics;

import java.util.ArrayList;

public class Calculate {
    ArrayList<Double> numbers;

    public Calculate(ArrayList<Double> numbers){
        this.numbers = numbers;
    }

    // Calculating the Mean:
    public double calcMean(){
        double sum = 0.0;
        for (int i=0; i< numbers.size(); i++){
            sum += numbers.get(i);
        }
        double mean = sum/numbers.size();

        return mean;
    }

    // Calculating the Variance
    public double calcVariance(){
        double m = calcMean();
        double sum = 0.0;
        for (int n=0; n<numbers.size(); n++){
            sum += Math.pow(numbers.get(n) - m, 2);
        }
        double variance = sum/numbers.size();

        return variance;
    }

    // Calculating the Standard Deviation
    public double calcStdDev(){
        double v = calcVariance();
        double stdDev = Math.sqrt(v);

        return stdDev;
    }
}
