public class TrappingRainWater {
    public static int maxWater(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int leftMax = arr[left];
        int rightMax = arr[right];
        int waterQuantity = 0;

        while (left < right) {


            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    waterQuantity += leftMax - arr[left];
                }
                left++;
            }
            else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    waterQuantity += rightMax - arr[right];
                }
                right--;
            }

        }
        return waterQuantity;
    }




    public static void main(String[] args) {
        int [] arr ={5,2,5 };
        System.out.println(maxWater(arr));
    }
}
 /*Initialize two pointers at both ends of the array.

 Store the tallest bars seen from the left and right.

 Store the total amount of trapped water.

 Process the array while the pointers haven't crossed.

 Process the left side if its height is smaller or equal.
 Update the left maximum if we find a taller bar.
 Otherwise, calculate the water trapped above the current bar.

 Move the left pointer forward.

 Process the right side if its height is smaller.
 Update the right maximum if we find a taller bar.
 Otherwise, calculate the water trapped above the current bar.

 Move the right pointer backward.

 Return the total trapped water */