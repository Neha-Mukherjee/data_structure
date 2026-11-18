import java.util.Arrays;

public class SumToTarget {
    public static int[] sumArray(int [] arr , int target){

        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                left++;
                right--;
                return new int[]{arr[left],arr[right]};

            }
            else if(sum>target){
                right--;
            }
            else {
                left++;
            }


        }
        return new int [0] ;
    }

    public static void main(String[] args) {
        int [] arr={-1,2,5};
        int target=7;
        System.out.println( Arrays.toString(sumArray(arr,target)));




    }
}

//this takes o(n) time complexity but it requires a sorted array as an input
//if u put a unsorted array an empty array will return
//u can use Arrays.sort(arr) in the beginning of the method but then the time complexity will become O(nlogn)

