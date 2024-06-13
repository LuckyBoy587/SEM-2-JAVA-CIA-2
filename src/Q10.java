import java.io.*;
import java.util.*;

public class Q10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        FileWriter fileWriter = new FileWriter("array.txt");
        for (int element : array) {
            fileWriter.write(element + "\n");
        }
        fileWriter.close();
        int sum = getSum();
        System.out.println(sum);
    }

    private static int getSum() throws IOException {
        Scanner sc = new Scanner(new File("array.txt"));
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + max;
    }
}