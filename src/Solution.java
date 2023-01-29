import java.util.Arrays;
public class Solution {
    static String toCamelCase1(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
    static String toCamelCaseJr246(String s){
        String[] words = s.split("[-_]+");
        return Arrays.stream(words)
                .skip(1)
                .map(w -> w.substring(0, 1).toUpperCase().concat(w.substring(1)))
                .reduce(words[0], String::concat);
    }
    static String toCamelCase(String s){
        String x = "", m = "";// x holds each word from the str while m will concatenate each character from x
        String[] str = null;// str will store the input string array after being split.
        if(s.isEmpty())
            return s;
        // checks to see if s contains any hyphen or underscore.
        for(int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 45) {
                str = s.split("-");
                break;
            } else if (s.charAt(j) == 95) {
                str = s.split("_");
                break;
            }
        }

        for(int i = 0; i < str.length; i++){
            x = str[i];// holds each word from str
            // ASCII value of capital letter is from 65 to 95
            if(i == 0 && (str[0].charAt(0) >= 65 && str[0].charAt(0) <= 90)){
                for(int c = 0; c < x.length(); c++){
                    if(c == 0){
                        m += Character.toUpperCase(x.charAt(c));
                        continue;
                    }
                    m += x.charAt(c);
                }
            }
            else{
                for(int c = 0; c < x.length(); c++){
                    if(c == 0 && i != 0){
                        m += Character.toUpperCase(x.charAt(c));
                        continue;
                    }
                    m += x.charAt(c);
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.out.println(toCamelCase(""));
        System.out.println(toCamelCase("kayomb_ibond_a_muteb_chris"));
    }
}