public class MaxWaterContainer {
    public static int maxArea(int [] arr ){
        int n = arr.length;
        int left =0;
        int right =n-1;
        int width;
        int height;
        int area,maxArea;
        maxArea=0;
        while (left<right)
        {
            width = right-left;
            height=Math.min(arr[left], arr[right]);
            area = width*height;


            //if the calculate area is greater than the current max area it gets reassigned
            if(area>maxArea)
                maxArea=area;
            //here the two pointers logic is present
            //we move the shorter wall because the width decreases whenever we move a pointer
            if (arr[left] < arr[right]) {
                left++;
            }
            else
                right--;



        }
        return maxArea;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,5,1,6,9,3};
        System.out.println(maxArea(arr));
    }
}
/*
this problem we need to find which two lines will contain the most amount of water
like imagine a graph and we are filling water now which two lines together hold most water
the width is the difference of 2 indexes the higher the width is higher area
similarly the height is the min of either of the lines because after that water can spill over the container
area =width* height
time comp - O(n)
space comp -O(1)
 */