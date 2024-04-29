package InterviewQuestions;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 Problem statement: - Given an integer array nums, return the third maximum distinct number in this array.
                                      If the third maximum does not exist, return the maximum number.
 */
public class ThirdMaximumDistinctNumber {
    public static void main(String[] args) {

        int[] numberArray = {1,2,-2148493};
        int thirdMaximumNumber = findThirdMaximumInArray(numberArray);
        System.out.println("Third maximum number from a given array is : " + thirdMaximumNumber);

    }
    static private int findThirdMaximumInArray(int[] numberArray){

        int result=0;

        Set<Integer> uniqueNumbers = new TreeSet<>(Comparator.naturalOrder());
        for (int num : numberArray){
            uniqueNumbers.add(num);
        }
        if (uniqueNumbers.size()<=3){
            result= Arrays.stream(numberArray).max().getAsInt();
        }
        return result;
    }
}
