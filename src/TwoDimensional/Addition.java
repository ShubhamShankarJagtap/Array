package TwoDimensional;

import java.util.Scanner;

public class Addition {
    static int[][] addition(int[][] arr, int r1, int c1,int[][] brr, int r2, int c2) {

//        Validate whether given two matrices has same dimensions. If not, then they can't be added.
        if (r1!=r2 || c1!=c2)
            System.out.println("User has entered invalid inout unable to perform addition...");

        int[][] sum = new int[r1][c1];
        for (int i=0;i<r1;i++){                // row number
            for (int j=0;j<c1; j++){           // column number
                sum[i][j]= arr[i][j] + brr[i][j];
            }
        }
        return sum;
    }

    static void user_input(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        int[][] arr = new int[r1][c1];
        System.out.println("Enter" + " " + r1*c1 + " " + "Elements");
        for (int i=0; i<r1;i++){
            for (int j=0;j<c1;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number of rows");
        int r2 = scanner.nextInt();
        System.out.println("Enter the number of column.");
        int c2 = scanner.nextInt();

        int[][] brr = new int[r2][c2];
        System.out.println("Enter" + " " + r2*c2 + " " + "Elements");
        for (int i=0; i<r2;i++){
            for (int j=0;j<c2;j++){
                brr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix 1....");
        Demo.printArray(arr);
        System.out.println("Matrix 2...");
        Demo.printArray(brr);

        int[][] sum=addition(arr, r1, c1,brr,r2,c2);
        System.out.println("The array after sum of 2 Arrays is ");
        Demo.printArray(sum);
    }
    public static void main(String[] args) {

        user_input();
    }
}
