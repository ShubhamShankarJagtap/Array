package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThirdLargest {

    static private int getThirdLargestElement() {

        int thirdLargestElement = 0;

        List<Integer> arr = Arrays.asList(34, 27, 13, 84, 98);
        Collections.sort(arr);

        thirdLargestElement = arr.get(2);

        return thirdLargestElement;
    }

    static private void comparison(){

//        on the basis of comparator
        List<Integer> arr = Arrays.asList(34, 27, 13, 84, 98);

        Comparator<Integer> comparator = (o1, o2)-> {

            if (o1%10 < o2%10)
                return -1;
            else
                return 0;
        };

        arr.sort(comparator);
        System.out.println(arr);
    }
    public static void main(String[] args) {

//        int largestElement = getThirdLargestElement();
//        System.out.println("The third largest element in a given array is : " + largestElement);
        comparison();
    }
}
