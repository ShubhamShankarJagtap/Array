package TwoDimensional;

import java.util.Arrays;

public class Quize {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = findSum(matrix);
        System.out.println("The sum is : " + sum);
    }
    static private int findSum(int[][] arr){

        int sum=0;
        for (int i=0; i< arr.length;i++){
            sum+=arr[i][i];
            System.out.println(Arrays.toString(arr[i]));
            System.out.println(sum);
        }

        return sum;
    }
}
