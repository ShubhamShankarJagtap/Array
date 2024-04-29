package InterviewQuestions;

/*
Problem - Rotate an array of n elements to the right by k steps.
e.g - n=7, k=3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */

import java.util.Arrays;

public class RotateAnArray {

    static public void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7};
        rotate(number, 3);
    }

    static public void rotate(int[] number, int k) {

        if (k > number.length)
            k = k % number.length;

        int[] result = new int[number.length];

        for (int i = 0; i < k; i++) {
            result[i] = number[number.length - k + i];
        }

        int j = 0;
        for (int i = k; i < number.length; i++) {
            result[i] = number[j];
            j++;
        }

        System.arraycopy(result, 0, number, 0, number.length);

        System.out.println(Arrays.toString(result));
    }


}
