//Write a Java program which takes a sentence as string and returns a sentence on which words are reversed in order, like if the input is "Java is best programming language", the output should be "language programming best is Java".//


import java.util.Scanner;

public class q1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed Sentence: "+reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }
        return reversedSentence;
    }
}