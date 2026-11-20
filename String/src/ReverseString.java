public class ReverseString {
    //returning the reversed string using temp variables and time complexity - O(n) and space - O(n)
    //this is two pointer approach - storing the string in chararray because string is not mutable(immutable) after creation
    //string - "hello"
    //char - ['h','e','l','l','o']
    public static String reverseString(String str){
        char [] arr = str.toCharArray();
        int n=arr.length;
        int left = 0;
        int right =n-1;

        while(left<right){
            char temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left ++;
            right --;
        }
        return new String(arr);
        }

        //just printing the string reversed with O(n) time complexity and O(1) auxiliary space
        public static void reversal(String str ){
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }

        }

    public static void main(String[] args) {
        String str = "hello";
      //  char[] ch ={'h', 'e', 'l', 'l', 'o'};
        reversal(str);
        System.out.println();
        System.out.println(reverseString(str));
    }
}
/*
since we are accepting string we are needing to create a new character array which is leading to O(n) space
if we were to accept char array then it will be O(1) space in two pointer approach
 */