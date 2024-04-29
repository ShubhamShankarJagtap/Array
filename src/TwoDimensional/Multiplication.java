package TwoDimensional;


import java.util.Scanner;

//        If the number of columns of first matrix is equal to the number of rows of second matrix, then & then only you can multiply those matrices.
//        i.e., the number of columns of first matrix must be equal to the number of rows of second matrix.
public class Multiplication {

    static void multiply(int[][] arr, int r1, int c1,int[][] brr, int r2, int c2){

        if (c1!=r2) {
            System.out.println("Multiplication is not possible... wrong dimensions");
            return;
        }

        int[][] mult = new int[r1][c2];

        for (int i=0; i<r1;i++){         // i represent the row number
            for (int j=0; j<c2;j++){     // j represent column number
                for (int k=0; k<c1; k++){
                    mult[i][j] += (arr[i][k]*brr[k][j]);
                }
            }
        }

        System.out.println("The multiplication two matrices is");
        Demo.printArray(mult);
    }

    static void takeUserInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row1 = scanner.nextInt();
        System.out.println("Enter the number of column.");
        int column1 = scanner.nextInt();

        int[][] arr = new int[row1][column1];
        System.out.println("Enter" + " " + row1*column1 + " " + "Elements");
        for (int i=0; i<row1;i++){
            for (int j=0;j<column1;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row2 = scanner2.nextInt();
        System.out.println("Enter the number of column.");
        int column2 = scanner2.nextInt();

        int[][] brr = new int[row2][column2];
        System.out.println("Enter" + " " + row2*column2 + " " + "Elements");
        for (int i=0; i<row2;i++){
            for (int j=0;j<column2;j++){
                brr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix 1 is as follows.");
        Demo.printArray(arr);
        System.out.println("The matrix 2 is as follows.");
        Demo.printArray(brr);

        multiply(arr, row1, column1, brr, row2, column2);
    }
    public static void main(String[] args) {

        takeUserInput();
    }
}
