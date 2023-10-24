package com.company;

public class AvgThread  {
    double avg;
    int min;
    int max;

    synchronized void getAvg(int [] arr){
        int sum=0;
        for(int i=0; i<5; i++){
            sum+=arr[i];
        }
        avg = (double)sum/(double)5;
        System.out.println("Average: " +avg);
    }

    synchronized void getMin(int [] arr){
        min=999;
        for (int i=0; i<5; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum: " +min);
    }

    synchronized void getMax(int [] arr){
        max=0;
        for(int i=0; i<5; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Max: " +max);
    }
}
