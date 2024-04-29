package InterviewQuestions;

import java.util.Arrays;

/*
problem - Find the kth largest element in an unsorted array.

Note - It should be kth the largest element in a sorted order, not the kth distinct element.

E.g - [3,2,1,5,6,4] and k=2, return 5.

Assume - k is always valid and 1<=k<=array.length.
 */
public class Kth_Largest_Element {

    public static void main(String[] args) {

        int[] number = {37,29,13,56,65,44};
        int k = 2;
        int element = findKthLargestElement(number,k);
        System.out.println("The " + k + "th" + " Largest element is : " + element);
    }

    static public int findKthLargestElement(int[] number, int k){

        Arrays.sort(number);

        return number[k-1];
    }
}
