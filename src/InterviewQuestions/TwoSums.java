package InterviewQuestions;

import java.util.HashMap;

public class TwoSums {

    int[] twoSums(int[] arr, int target){

        int n = arr.length;
        int[] ans = {-1};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i=0; i<n; i++){

            int partner = target - arr[i];
            if (hashMap.containsKey(partner)){
                ans = new int[]{i,hashMap.get(partner)};
                return ans;
            }
            else {
                hashMap.put(arr[i], i);
            }
        }


        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {2, 11, 13, 15, 7};
        int target = 9;

        int[] indices = new TwoSums().twoSums(arr, target);
        for (int indexes : indices){
            System.out.print(indexes + ",");
        }
    }
/*
    private static Map<Integer, Integer> twoSums(int[] arr) {

        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 9) {
                    indices.put(i, j);
                }
            }
        }
        return indices;
    }

 */
}
