import java.util.HashMap;

public class IsAnagram {
    //using one hashmap
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch) || map.get(ch) == 0)
                return false;

            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    //using 2 hashmaps
        public static boolean isAnagram2Hashmap(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Integer> sCount = new HashMap<>();
            HashMap<Character, Integer> tCount = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                sCount.put(s.charAt(i), 1 + sCount.getOrDefault(s.charAt(i), 0));
                tCount.put(t.charAt(i), 1 + tCount.getOrDefault(t.charAt(i), 0));
            }

            return sCount.equals(tCount);
        }

    public static void main(String[] args) {
        String s = "hello";
        String t = "elloh";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram2Hashmap(s,t));

    }
}
