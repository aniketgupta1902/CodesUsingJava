package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static int [] arr = new int[5];
    public static void main(String[] args) {
        getIntegers(5);
        sortIntegers(arr, 5);
        printArray(arr, 5);

    }
    public static int [] getIntegers(int capacity){

        for(int i=0; i<capacity; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void printArray(int [] arr, int n){
        System.out.println("Array is: " + Arrays.toString(arr));
    }
    public static void sortIntegers(int [] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n-i; j++){
                if(arr[j-1]<arr[j]){
                    int temp=0;
                    temp=arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
