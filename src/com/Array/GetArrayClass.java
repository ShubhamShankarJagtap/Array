package com.Array;

public class GetArrayClass {
    public static void main(String[] args) {

        int [] a = {23,13,64,44,45};

        Class c = a.getClass();

        String name = c.getName();

        System.out.println(name);

    }
}
