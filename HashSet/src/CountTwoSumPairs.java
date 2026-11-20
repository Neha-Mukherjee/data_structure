import java.util.Arrays;
import java.util.HashMap;

public class CountTwoSumPairs {

    public static int countPairs(int[] arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num:arr){
            int complement = target - num;
            if(map.containsKey(complement))
                count ++;

            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = { 2,3,4,1,5,7,5};
        int target = 8;
        System.out.println(countPairs(arr,target));
    }
}
