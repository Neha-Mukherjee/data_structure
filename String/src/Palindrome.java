public class Palindrome {
    public static boolean palindrome(String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left)==str.charAt(right)){
                left ++;
                right --;
            }
            else
                return false;

        }

        return true;

    }

    public static void main(String[] args) {
        String str="WOwoW";
       if(palindrome(str))
           System.out.println(str + " is  Palindrome");
       else
           System.out.println(str + " is not Palindrome ");

    }
}
