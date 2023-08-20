package com.Array;

public class Anonymous_Array {

    // Creating a method which receives an array as a parameter.

    static void printArray(int [] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{10,22,34,44,54,66});
    }
}
