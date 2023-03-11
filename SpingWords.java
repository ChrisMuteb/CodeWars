public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str += (words[i].length() > 4) ? reverse(words[i]) : words[i] + " ";
        }
        return str.trim();
    }
    String reverse(String word){
        String w = "";
        for(int c = word.length()-1; c >= 0; c--)
            w += word.charAt(c);
        return w + " ";
    }
}
