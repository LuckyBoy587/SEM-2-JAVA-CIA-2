import java.util.Scanner;

class Q7_i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String result = removeSpaces(sentence);
        System.out.println(result);
    }

    public static String removeSpaces(String sentence) {
        return sentence.replaceAll(" ", "");
    }
}

class Q7_ii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mobileNumber = scanner.next();

        if (isValidMobileNumber(mobileNumber)) {
            System.out.println("Mobile number valid");
        } else {
            System.out.println("Mobile number invalid");
        }
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        if (mobileNumber.length() != 13) {
            return false;
        }

        if (mobileNumber.indexOf("+91") != 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder(mobileNumber.substring(3));
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isDigit(sb.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}