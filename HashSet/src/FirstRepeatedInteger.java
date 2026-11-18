
import java.util.HashSet;

public class FirstRepeatedInteger {
    public static int repeatedInt(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i< arr.length;i++){
            if (!set.add(arr[i])) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,2,2,1,2};
        System.out.println(repeatedInt(arr));
    }
}
//On -time comp
//On space
//Because the first 2 was already stored in the HashSet. When the second 2 arrives, add() returns false hence 2 becomes the first repeated integer