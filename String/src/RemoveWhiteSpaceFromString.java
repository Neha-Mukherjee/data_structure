public class RemoveWhiteSpaceFromString {
    public static String removeWhiteSpace(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isWhitespace(str.charAt(i)))
                sb.append(ch);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str ="how are you ? i am fineeeeee .";
        System.out.println(removeWhiteSpace(str));

    }
}

