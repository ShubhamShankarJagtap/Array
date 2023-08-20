package com.Array;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class ArrayDemo1 {

    static private int[] arrayDemo1(){

        int[] a = new int[]{1,2,3,4,5};
        return a;
    }


    public static void main(String[] args) {

        int[] b=arrayDemo1();
        for (int c : b){
            out.println(c);
        }
    }
}
