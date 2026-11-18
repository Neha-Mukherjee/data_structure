import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumToZero {
    //three sum whose sum is zero
    public static List<List<Integer>> threeSumZero(int [] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

       for (int i=0;i<arr.length-2;i++){
           //prevent duplicates it checks that i is greater than zero and the element in i and the element before it is same then it skips it
           // only for i that is fixed element
           if (i > 0 && arr[i] == arr[i - 1])
               continue;
           int left = i+1;
           int right = arr.length-1;
           while (left<right)
           {

             int sum=  arr[left]+arr[right];
               if(sum==-arr[i]) {
                   result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                   left ++;
                   right--;
                   //skips duplicates for left elements
                   while (left < right && arr[left] == arr[left - 1]) {
                       left++;
                   }
                   //skips duplicates for right elements
                   while (left < right && arr[right] == arr[right + 1]) {
                       right--;
                   }


               }
               else if(sum <-arr[i])
                   left ++;
               else if(sum>-arr[i])
                   right --;

           }

        }
        return result ;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -1, 0, 1, 2,1,2,2,3,-3};
        System.out.println(threeSumZero(arr));
    }
}
/* say the first element is -1 what can be the sum of other two elements so the target sum is 0
it should be 1
so arr[left] + arr[right] = - arr[i]
 left and right are the two pointers that are calculating the sum
 the two pointer are moving towards each other in the while loop so the time complexity for while loop is O(n)
 and as the for loop continue for n number of elements the time complexity there is O(n)
 as there's sorting in the beginning the time complexity is O(nlogn) for sorting
 together its O(ologn+ n^2)
 we choose the dominant term n^2 because n keeps growing so n^2 grows faster than nlogn

 */