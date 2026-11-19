import java.util.*;

public class ArrayIntersection {
   //mutiplicity in the intersection is allowed
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequencies in the first array
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find common elements, including multiplicity
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return result;
    }

    //multiplicity is not allowed in the intersection
        public static List<Integer> intersectUnique(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> result = new HashSet<>();

            for (int num : nums1) {
                set.add(num);
            }

            for (int num : nums2) {
                if (set.contains(num)) {
                    result.add(num);
                }
            }

            return new ArrayList<>(result);
        }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 2, 4};

        System.out.println(intersect(nums1, nums2));//[2,2]
        System.out.println(intersectUnique(nums1,nums2));//[2]
    }
}