package SDET_Pavan_Kumar;

public class Repeatations {
    public static void main(String[] args) {
        int[] a= {100, 200, 300, 100, 400, 500, 100, 700, 100, 800, 900, 100, 1000};
        int findNumber = 100;
        int count=0;
        for (int value : a){

            if (value==findNumber){
                count++;
            }
        }

        System.out.println("The occurrence of number" + findNumber + " in a given array is " + count + " times.");
    }
}
