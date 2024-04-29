package SDET_Pavan_Kumar;

public class SearchElement {

    public static void main(String[] args) {

        int[] a = {12, 20, 30, 40, 30, 30};
        int searchElement = 30;
        boolean status = false;

        for (int j : a) {

            if (j == searchElement) {
                System.out.println("Element found");
                status = true;
                break;
            }
        }

        if (!status)
            System.out.println("Element not found.");
    }
}
