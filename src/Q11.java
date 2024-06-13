import java.io.*;
import java.util.*;

class Q11_i {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("input.txt");
        fileWriter.write(input);
        fileWriter.close();

        Scanner fileScanner = new Scanner(new File("input.txt"));
        while (fileScanner.hasNext()) {
            String word = fileScanner.next();
            if (containsVowel(word)) {
                System.out.println(word);
            }
        }
        fileScanner.close();
    }

    public static boolean containsVowel(String word) {
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c)!= -1) {
                return true;
            }
        }
        return false;
    }
}

class Q11_ii {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(input1 + "\n");
        fileWriter.write(input2 + "\n");
        fileWriter.close();

        FileReader fileReader = new FileReader("output.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine())!= null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}