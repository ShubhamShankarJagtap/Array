package SDET_Pavan_Kumar;


import java.util.Arrays;

/*
Problem Statement:-
                      Given the array nums, for each num[i] find out how many numbers in an array are smaller than it.
                      That is, for each nums[i] you have to count the number of valid j's such that,
                      j!=i and nums[j]<nums[i].

                     Return an answer in an array.
                     2<=nums.length<=500
                     0<=nums[i]<=100
 */
public class Sorting {

    public static void main(String[] args) {

        int[] numberArray = {8, 1, 2, 2, 3};
        int[] numberSmaller = findSmaller(numberArray);
        System.out.println("Number's that are smaller than the current number are : " + Arrays.toString(numberSmaller));
    }

    static private int[] findSmaller(int[] numberArray) {

        int[] smallerNumbers = new int[numberArray.length];

        if (numberArray.length>=2 && numberArray.length<=500) {

            for (int i = 0; i < numberArray.length; i++) {

                int count = 0;

                for (int j = 0; j < numberArray.length; j++) {

                    if (i != j && numberArray[i] > numberArray[j]) {
                        count++;
                    }
                    smallerNumbers[i] = count;
                }
            }
        }
        return smallerNumbers;
    }
}
