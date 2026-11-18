import java.util.Arrays;


public class SortedSquares {

    public static int[] sortedSquares(int[] arr) {

        int n = arr.length;

        // Square every element
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Sort the squared elements
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        int[] result = new int[n];
        int index = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                result[index] = arr[left];
                left++;
            } else {
                result[index] = arr[right];
                right--;
            }
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}