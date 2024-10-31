// Write a Java program to read two strings, append them together and 
// return the result. If the strings are different lengths, remove characters 
// from the beginning of longer string and make them equal length. For 
// example, the given strings is: Welcome and home. The new string is: 
// comehome.

public class q4{
    public static void main(String[] args) {
        String word1 = "Welcome";
        String word2 = "home";

        if(word1.length()>word2.length()){
            word1 = word1.substring(word1.length()-word2.length());
        } else if(word2.length()>word1.length()){
            word2 = word2.substring(word2.length()-word1.length());
        }
        String newWord = word1 + word2;
        System.out.println(newWord);
    }
}