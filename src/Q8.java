import java.util.Scanner;

class Q8_i {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = removeSpaces(input);
        System.out.println("Output: " + output);
    }

    public static String removeSpaces(String input) {
        return input.replaceAll("\\s", "");
    }
}

class Q8_ii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String middleValue = getMiddleValue(input);
        System.out.println("Middle value: " + middleValue);
    }

    public static String getMiddleValue(String input) {
        int length = input.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            return input.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return input.substring(middleIndex, middleIndex + 1);
        }
    }
}