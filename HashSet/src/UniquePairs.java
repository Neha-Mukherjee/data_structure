import java.util.Arrays;
import java.util.HashMap;

public class UniquePairs {
    public static HashMap<Integer,Integer> countFreq(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            //getorDefault method ads 1 to the prev saved element thats how the countfrequency is working here
            //for eg here arr[i] stores 2 when getordefault encounters 2 it adds 1 to 0 increasing it count by one
            //now each time it encounter the same value it keeps adding 1 that many times
            //if the key doesn't exist then t returns the default value -0
            //getOrDefault() itself does not add 1. The +1 in the statement does that
            //getOrDefault() retrieves +1 increments and put() saves.
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        return map;
    }

    public static void main(String[] args) {
        int [] arr ={1,4,2,5,2,2,3,1};
        System.out.println(countFreq(arr));
    }
}
