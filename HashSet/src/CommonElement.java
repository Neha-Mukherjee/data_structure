import java.util.HashSet;

public class CommonElement {
    public static boolean commonElement(int[] arr , int [] arr1){
        HashSet<Integer> set = new HashSet<>();
        //this loop adds the elements of arr into the hashset
        for(int i = 0 ; i< arr.length;i++)
        {
                set.add(arr[i]);
        }
        //this loop is being used to check if the set contains any common element from the second array
        for(int j = 0 ; j<arr1.length;j++){
            if(set.contains(arr[j]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,7,2};
        int [] arr1 = {4,6,9,3,2};
        System.out.println(commonElement(arr,arr1));
    }
}
//time complexity = O(n+m)


