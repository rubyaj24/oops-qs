// Write a Java program to replace each substring of a given string that 
// matches the given regular expression with the given replacement. For 
// example, the sample string is "The quick brown fox jumps over the lazy 
// dog." In the above string, replace all the fox with cat.
public class q3 {
    public static void main(String[] args) {
        String word1 = "The quick brown fox jumps over the lazy dog.";
        String word2 = "cat";

       String b = word1.replace("fox", word2);
       System.out.println(b);
    }
}