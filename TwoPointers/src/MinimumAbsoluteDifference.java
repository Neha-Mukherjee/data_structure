import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static List<List<Integer>> MinAbsDiff(int [] arr1,int[] arr2){

        if (arr1.length == 0 || arr2.length == 0)
            return new ArrayList<>();
        int n1 = arr1.length;
        int n2= arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        long minDiff = Integer.MAX_VALUE;


        while(i<n1 &&j<n2 )
        {

            long diff =(long) Math.abs(arr1[i]-arr2[j]);
            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(Arrays.asList(arr1[i], arr2[j]));
            } else if (diff == minDiff) {
                result.add(Arrays.asList(arr1[i], arr2[j]));
            }
            if (arr1[i] > arr2[j]) {
                j++;
                   //for duplicates
                while (j < n2 && arr2[j] == arr2[j - 1]) {
                    j++;
                }
            } else {
                i++;
                //for duplicates
                while (i < n1 && arr1[i] == arr1[i - 1]) {
                    i++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr1={2,3,6,1,4,2};
        int [] arr2={8,3,5,1,2,3};
        System.out.println(MinAbsDiff(arr1,arr2));

    }
}
/*
O(n log n) time for sorting and O(1) auxiliary space
 */