import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int [] arr={1,2,0,0,2};
       arr= moveZeros(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] moveZeros(int[] arr){
        int i;
        int j = 0;
        for(i=0;i< arr.length;i++){
            if(arr[i]!=0)
            {
                arr[j] = arr[i];
                j++;
            }

        }
        for(i=j;i< arr.length;i++){
           arr[i]=0;

        }
        return arr;
    }

}
