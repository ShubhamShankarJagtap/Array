package InterviewQuestions;

public class SearchElement {

    static private boolean numberFound(int[] arr) {

        boolean flag = false;

        int target = 9;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int middle = (low + high) / 2;

            if (arr[middle] == target) {

                System.out.println(" We have found the target....");
                flag = true;
                break;
            } else if (arr[middle] < target) {

                low = middle + 1;
            } else {

                high = middle - 1;
            }
        }

        if (!flag) {

            System.out.println("We have not found the target..");
        }
        return flag;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isFound = numberFound(arr);
        System.out.println("am I able to find that number in an array?...." + isFound);
    }
}
