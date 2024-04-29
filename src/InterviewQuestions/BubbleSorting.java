package InterviewQuestions;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 3, 5};
        System.out.println("before sorting....." + Arrays.toString(arr));

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {                 // the number of passes should be length-1

            for (int j = 0; j < n - 1; j++) {         // inner for loop is for iterations.

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];           // Swapping the number's
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting......." + Arrays.toString(arr));
    }
}
