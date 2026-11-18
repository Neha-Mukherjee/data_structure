import java.util.*;

public class TwoSumToTargetWithMap {

    public static List<List<Integer>> sumTarget(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : arr) {

            int complement = target - num;

            if (map.containsKey(complement)) {
                result.add(Arrays.asList(complement, num));
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 7, 2, 1, 3, 0};
        int target = 4;

        System.out.println(sumTarget(arr, target));
    }
}