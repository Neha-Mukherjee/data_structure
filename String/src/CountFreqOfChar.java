import java.util.HashMap;
import java.util.Scanner;

public class CountFreqOfChar {
    public static HashMap<Character,Integer> countFreq(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to count frequency of characters");
        String str = sc.nextLine();
        System.out.println(countFreq(str));
    }
}
