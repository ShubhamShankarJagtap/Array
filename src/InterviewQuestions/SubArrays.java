package InterviewQuestions;

import java.util.HashMap;

/*

Problem Statement: -
                                      Given an array arr[] of length n, find the length of largest subArray with sum equal to '0'.
 */
public class SubArrays {

  private int subArray(int[] arr){

      int answer=0;

      HashMap<Integer, Integer> hashMap = new HashMap<>();
      int max=0,prefix=0;
      hashMap.put(0,-1);
      for (int i=0;i<arr.length;i++){

      }

      return answer;
    }

    public static void main(String[] args) {

      int[] arr = {15,-2,2,-8,1,7,10,23};

      int length = new SubArrays().subArray(arr);
        System.out.println("The length of largest subArray is : " + length);
    }
}
