
import java.util.Arrays;


public class ThreeSumClosest {


    public static int threeSum(int[] arr,int target) {
        Arrays.sort(arr);
        //initialising closest sum with the sum of first three elements
        int closestSum = arr[0]+arr[1]+arr[2];
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i]+arr[left]+arr[right];
                //math.abs finds the absolute value of a number removing any negative symbols
                //if 10-7 = 3 and 10-12 is -2 abs will remove the negative symbol and chose 12 as it is the least distance
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                //as the array is sorted when the sum is greater than target we decrease the element from right
                if(sum>target)
                {
                    right --;

                }
                //similarly when the sum is less than the target we increase the left element
               else if(sum<target)
                   left++;
               // if the sum and target is the same just return the sum
               else if(sum == target)
                   return sum;
            }

        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,0};
        int target = 7;
        System.out.println(threeSum(arr,target));
    }
}