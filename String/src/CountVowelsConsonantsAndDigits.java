public class CountVowelsConsonantsAndDigits {
    public static int count(String str){
        int digitCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int digit;
        for (int i =0; i<str.length();i++){
            char [] vowels = {'a','e','i','o','u'};
            if(Character.isDigit(str.charAt(i))){
                digitCount++;
            }
            if(str.charAt(i)==vowels[i]){

            }
        }
    }
}
