public class Palindrome {
    public static boolean isPalindrome(String str) {
     str=str.toLowerCase();
       int left = 0;
        int right = str.length() - 1;
        while (left < right) {

            //added this to check if whole sentences are palindrome
            //for sentences we needed to ignore spaces
//            if(str.charAt(left)==' ' &&  str.charAt(right)!=' '){
//                left++;
//                continue;}
//            if (str.charAt(right)==' ' &&  str.charAt(left)!=' ') {
//                right--;
//                continue;
//            }
//            if (str.charAt(left)==' ' &&  str.charAt(right)==' '){
//                left ++;
//                right--;
//                continue;
//            }


            //instead of just checking spaces and using so many if statements just use java inbuilt method Character.isLetterOrDigit
            //this will skip anything that's not a number or letter
          if( ! Character.isLetterOrDigit(str.charAt(left))) {
              left++;
              continue;
          }
          if(! Character.isLetterOrDigit(str.charAt(right))) {
              right--;
              continue;
          }
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;

            }

            else {
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
       String s = "A ..,,   man a plan a canal Panama";
       // String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
