import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        if (isAlternatingCode(code)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isAlternatingCode(String code) {
        if (code.length() < 2) {
            return false;
        }

        char firstChar = code.charAt(0);
        char secondChar = code.charAt(1);

        for (int i = 2; i < code.length(); i++) {
            if (i % 2 == 0) {
                if (code.charAt(i) != firstChar) {
                    return false;
                }
            } else {
                if (code.charAt(i) != secondChar) {
                    return false;
                }
            }
        }

        return true;
    }
}