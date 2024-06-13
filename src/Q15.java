import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        if (isPalindrome(sentence)) {
            System.out.println("The sentence is a palindrome!");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String sentence) {
        sentence = sentence.replaceAll(" ", "").toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer(sentence, "");
        StringBuilder reversedSentence = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            reversedSentence.insert(0, tokenizer.nextToken());
        }

        return sentence.contentEquals(reversedSentence);
    }
}