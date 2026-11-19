import java.util.*;

public class Duplicates {
    public static HashMap<Integer,Integer> duplicateValue(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> duplicates = new HashMap<>();
        for(int i =0;i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1)
                duplicates.put(entry.getKey(), entry.getValue());
        }
        return duplicates;
    }


    //hashmap with hashset approach
    public static HashSet<Integer> duplicateValueHashSet(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
    //this is the leetcode approach with constraints where the code needs to have O(n) time complexity and O(1) space
    //so a new hashmap or hashset cannot be created
    //i understood that the range of the number is n-1 and as index starts from zero whenever the the loop start the index will be the the number-1
    // eg if the number is 8 then index is 8-1 = 7 so it will go at index 7
    //if index 7 has number 2 then the number at that index will be marked as negative here 2 becomes -2
    //so when we land on the same number again and it is marked as negative it is added in the result list
    public static List<Integer> findDuplicatesList(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int [] arr = {2,1,3,2,2,4,5};
        //new input for the list approach the constraint is that the number can atmost be repeated twice
        int [] arr1 = {2,1,3,2,4,4};
        System.out.println(duplicateValue(arr));
        System.out.println(duplicateValueHashSet(arr));
        System.out.println(findDuplicatesList(arr1));
    }
}
