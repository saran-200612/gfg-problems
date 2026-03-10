import java.util.*;

public class IndexSubarray {

    public static ArrayList<Integer> subarraySum(int[] arr, int s) {

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {

            currentSum += arr[end];

            while (currentSum > s && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == s) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int s = 12;

        ArrayList<Integer> result = subarraySum(arr, s);

        System.out.println(result);
    }
}