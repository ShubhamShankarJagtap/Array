package InterviewQuestions;

public class Second_Maximum {

    static private int find_Second_Maximum(int[] arr){

        int secondMax = 0;
        int temp = 0;

        for (int i=0; i<arr.length; i++){

            for (int j=i+1; j<arr.length; j++){

                if(arr[i]<arr[j]){

                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

                if (i==2)
                    break;
            }

            secondMax = arr[1];
        }

        return secondMax;
    }
    public static void main(String[] args) {

        int[] arr = {23,-98, 73,31,84,26,31,12};
        int second_Maximum = find_Second_Maximum(arr);
        System.out.println("The second maximum number from a given array is : " + second_Maximum);
    }
}
