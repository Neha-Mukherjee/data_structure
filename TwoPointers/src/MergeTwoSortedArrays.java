import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeArray(int [] arr1, int [] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int k=0;
        int i =0;
        int j=0;
        while(i<arr1.length && j< arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
            while (i < arr1.length) {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            while (j < arr2.length) {
                arr[k] = arr2[j];
                j++;
                k++;
            }
            return arr;



            }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2={3,4,5};
        mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(mergeArray( arr1,arr2)));
    }
        }

