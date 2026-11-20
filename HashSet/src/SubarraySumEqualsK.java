import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int [] arr , int target){

                int sum = 0, result = 0;
                HashMap<Integer, Integer> preSum = new HashMap<>();
                preSum.put(0, 1);

                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                    if (preSum.containsKey(sum - target)) {
                        result += preSum.get(sum - target);
                    }
                    preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
                }

                return result;
            }

    public static void main(String[] args) {
        int [] arr = {2,5,3,7,8,5,2,1};
        int target = 8;
        System.out.println(subarraySum(arr,target));
    }
}


