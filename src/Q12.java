import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Q12_i {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("sample.txt");
        fileWriter.write(sc.nextLine());
        fileWriter.close();

        FileReader fileReader = new FileReader("sample.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int characterCount = 0;
        String line;
        while ((line = bufferedReader.readLine())!= null) {
            characterCount += line.length();
        }
        bufferedReader.close();
        System.out.println("Number of characters in file are " + characterCount);
    }
}

class Q12_ii {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the content (type 'exit' to finish):");
        StringBuilder content = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            content.append(line).append("\n");
        }
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(content.toString());
        fileWriter.close();

        FileReader fileReader = new FileReader("output.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        Map<String, Integer> wordCount = new HashMap<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                word = word.toLowerCase();
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        bufferedReader.close();
        String mostRepeatedWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeatedWord = entry.getKey();
            }
        }

        System.out.println("Most repeated word: " + mostRepeatedWord);
    }
}