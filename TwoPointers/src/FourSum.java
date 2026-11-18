import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> FourSumNumbers(int[] arr, int target) {

        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            //skips duplicates for i
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                //skips duplicates for j
                if (j > i+1 && arr[j] == arr[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum =(long) arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {

                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;
                        //skip duplicates on left
                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }
                        //skips duplicates for right elements
                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    } else if (sum > target)
                        right--;
                    else if (sum < target)
                        left++;

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr ={1,4,5,62,3,7,8,-1,-4};
        int target = 10;
        System.out.println(FourSumNumbers(arr,target));
    }
}
/*
time complexity
sorting-O(nlogn)
2 for loops - O(n^2)
while loop with 2 pointers moving at each other - O(n)
overall -
O(nlog n) + O(n * n * n)
= O(n^3)

 */