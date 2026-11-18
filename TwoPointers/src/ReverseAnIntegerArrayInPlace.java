import java.util.Arrays;

public class ReverseAnIntegerArrayInPlace {
    public static int[] reverse(int[] arr) {
        int i=0;
        int j = arr.length-1;
        int temp=0;
        while (i <j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

            }
        return arr;
        }

    public static void main(String[] args) {
        int [] arr={5,2,-1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    }

