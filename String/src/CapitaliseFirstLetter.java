public class CapitaliseFirstLetter {
    public static String uppercase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            }

            sb.append(ch);

            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "java is a programming language";
        System.out.println(uppercase(str));
    }
}
/*
boolean is deciding which characters to capitalise next if its true then the character will capitilise if its false it will not
Boolean decides which characters should be uppercase
StringBuilder collects the modified characters
 */