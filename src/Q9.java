import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("sample.txt"))) {
            int count = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += scanner.nextInt();
            }
            System.out.println("Sum of values: " + sum);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}