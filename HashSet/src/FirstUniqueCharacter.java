import java.util.HashMap;

public class FirstUniqueCharacter {

    public static char firstUnique(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count character frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String str = "aabbcde";

        System.out.println(firstUnique(str));
    }
}