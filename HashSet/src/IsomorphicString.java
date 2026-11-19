import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    //using one hashmap while mapping to both the string the time complexity becomes O(n^2)
    //because containValue time complexity is O(n)
    //we are scanning the string twice by using containValue
    // containsValue() takes O(n) because it may scan all map entries.
    //You call it inside a loop that runs n times.
    //Therefore, worst-case time complexity is O(n²).
    public static boolean isStringIsomorphic(String str, String str1) {
        if (str.length() != str1.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str1.charAt(i);
            if (!map.containsKey(c1)) {
                if (map.containsValue(c2))
                    return false;

                map.put(c1, c2);

            }
            if (map.get(c1) != c2)
                return false;
        }
        return true;
    }

    //using two hashmaps for O(n)
    //containsKey takes up O(1) time complexity
    public static boolean isStringIsomorphic2Hashmap(String str, String str1) {


        if (str.length() != str1.length())
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char c1 = str.charAt(i);
            char c2 = str1.charAt(i);

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2)
                    return false;
            } else {
                map1.put(c1, c2);
            }

            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1)
                    return false;
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }



    public static void main(String[] args) {
        String str = "egg";
        String str1 = "add";
        System.out.println(isStringIsomorphic(str, str1));
        System.out.println(isStringIsomorphic2Hashmap(str,str1));
    }
}
