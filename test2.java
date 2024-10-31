import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuffer sb = new StringBuffer("aaaaaaaaaaaaaaaaabbbbcddddeeeeee");

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the StringBuffer and count each character
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the most frequent character
        char mostFrequentChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> e : charCountMap.entrySet()) {
            if (e.getValue() > maxCount) {
                mostFrequentChar = e.getKey();
                maxCount = e.getValue();
            }
        }

        // Print the most frequent character and its count
        System.out.println("Most frequent character: " + mostFrequentChar);
        System.out.println("Count: " + maxCount);
    }
}