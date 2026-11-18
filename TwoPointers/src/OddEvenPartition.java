import java.util.Arrays;

public class OddEvenPartition {


    public static void partition(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left while the element is even
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move right while the element is odd
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap odd on left with even on right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 7, 4};

        partition(arr);

        System.out.println(Arrays.toString(arr));
    }
}