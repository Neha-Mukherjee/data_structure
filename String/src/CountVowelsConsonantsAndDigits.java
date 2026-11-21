import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountVowelsConsonantsAndDigits {
    public static List<Integer> count(String str) {
       str=str.toLowerCase();
        int digitCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitCount++;

            } else if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                vowelCount++;


            } else if (Character.isLetter(str.charAt(i))) {
                consonantCount++;

            }

        }
        result.add(digitCount);
        result.add(vowelCount);
        result.add(consonantCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to count digit ,vowel , consonant ");
        String str = sc.nextLine();
        List<Integer> result = count(str);

        System.out.println("Digits: " + result.get(0));
        System.out.println("Vowels: " + result.get(1));
        System.out.println("Consonants: " + result.get(2));

    }
}
/*
the time complexity is O(n) but due to .tolowercase a new String is created for n elements so space complexity becomes O(n)
it can be avoided by using Character.tolowerase and that can make space complexity O(1)
char ch = Character.toLowerCase(str.charAt(i)); inside the for loop
Then use ch for all your checks:
 Character.isDigit(ch)
 Compare ch with 'a', 'e', 'i', 'o', 'u'.
 Character.isLetter(ch)
 */