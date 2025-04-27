package com.example.statistics;

public class Calculate {
    double[] arr;

    public Calculate(double[] arr){
        this.arr = arr;
    }

    // Calculating the mean:
    public double calMean(double[] arr){
        double sum = 0.0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double mean = sum/arr.length;

        return mean;
    }
}
