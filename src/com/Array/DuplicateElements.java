package com.Array;

import java.util.*;

import static java.lang.System.out;


// USING SET INTERFACE/CLASSES.

public class DuplicateElements {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 1, 5, 7, 4};
        new DuplicateElements().findDuplicate(arr);
    }

    void findDuplicate(int[] arr) {

        Set<Integer> uniqueNumber = new HashSet<>();

        for (int j : arr) {
            if (uniqueNumber.contains(j)) {
                out.println("duplicate element is : " + j);
            } else
                uniqueNumber.add(j);
        }
    }
}
