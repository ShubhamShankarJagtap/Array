package TwoDimensional;

import java.util.Scanner;

public class UserInput {

    static void takeUserInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = scanner.nextInt();
        System.out.println("Enter the number of column.");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];
        System.out.println("Enter" + " " + row*column + " " + "Elements");
        for (int i=0; i<row;i++){
            for (int j=0;j<column;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        Demo.printArray(arr);
    }
    public static void main(String[] args) {
        takeUserInput();
    }
}
