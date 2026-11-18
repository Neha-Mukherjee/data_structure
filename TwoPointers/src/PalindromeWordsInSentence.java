public class PalindromeWordsInSentence {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
           //just checks that the individual word are palindrome
              if(s.charAt(left)==s.charAt(right)){
                  left++;
                  right--;

              }
              else
                  return false;

          }


        return true;
    }
    public static void printPalindrome(String str){
       String [] str1 = str.split(" ");
       //if that particular word is palindrome it will be printed and other words in the sentence will be ignored
       for(String str2 : str1){
       if (isPalindrome(str2)) {
           System.out.println(str2);

       }


       }
    }

    public static void main(String[] args) {
        String str = "racecar mom dont hi hello why wow";
        printPalindrome(str);

    }
}
