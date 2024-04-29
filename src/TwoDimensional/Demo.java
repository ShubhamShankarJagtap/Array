package TwoDimensional;

public class Demo {

    static private void learnTwoDimensionalArray(){

        int[][] arr = new int[2][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;

        int[][] has = {{1, 3}, {4, 5}, {6, 8}, {8, 9}};

        printArray(arr);
        System.out.println("----------------------------------");
        printArray(has);
    }

    static void printArray(int[][] arr){

        for (int i=0;i< arr.length;i++){                       // represents row
            for (int j=0; j<arr[i].length; j++){               // represents column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        learnTwoDimensionalArray();
    }
}
