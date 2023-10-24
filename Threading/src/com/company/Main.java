package com.company;


public class Main {

    public static void main(String[] args) {

        int [] arr = {45, 64, 75, 32, 6};
        MyThread t1 = new MyThread();
        t1.setName("One");
        MyThread t2 = new MyThread();
        t2.setName("Two");
        MyThread t3 = new MyThread();
        t3.setName("Three");


        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){

        }
        t1.run(arr, 0);
        System.out.println("From thread: "+t1.getName());
        t2.run(arr, 1);
        System.out.println("From thread: "+t2.getName());
        t3.run(arr, 2);
        System.out.println("From thread: "+t3.getName());
    }
}
