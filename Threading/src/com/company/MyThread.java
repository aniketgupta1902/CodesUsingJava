package com.company;

public class MyThread extends Thread{
    AvgThread avg = new AvgThread();
    public void run(int [] arr, int choice){
        if(choice==0) {
            avg.getAvg(arr);

        }
        else if(choice==1) {
            avg.getMax(arr);

        }
        else if(choice==2) {
            avg.getMin(arr);
        }
    }
}
