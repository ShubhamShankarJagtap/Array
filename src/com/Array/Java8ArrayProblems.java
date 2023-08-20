package com.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;
public class Java8ArrayProblems {
    static public void findSecondSmallest(int[] arr){

        int secondSmallestNumber = Arrays.stream(arr).sorted().distinct().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Array doesn't have the second smallest number."));

        out.println("second smallest number in given array is : " + secondSmallestNumber);
    }

    static public List<Integer> fetchCommonElements(int[] arr1,int[] arr2){

        return Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2number -> arr2number==number)).boxed().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        int[] numbers = {5,3,1,8,7,1};

       findSecondSmallest(numbers);

        out.println("---------------------------------------");

        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {3,4,5,6,7,8};

       List <Integer> matchedElements = fetchCommonElements(array1,array2);

        out.println("The matching elements between the given arrays are : " + matchedElements);
    }
}

