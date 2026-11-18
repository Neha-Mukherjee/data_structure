import java.util.HashSet;

public class DistinctValue {
    public static int distinctValues(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);


        }
        return set.size();
    }

    public static void main(String[] args) {
        int [] arr = {2,2,3,1,5};
        System.out.println(distinctValues(arr));
    }
}
