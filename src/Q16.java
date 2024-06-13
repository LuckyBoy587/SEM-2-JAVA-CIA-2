import java.util.Scanner;

class Q16_i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date1 = scanner.next();

        String date2 = scanner.next();

        displayMonthBoard(date1, date2);
    }

    public static void displayMonthBoard(String date1, String date2) {
        String[][] monthBoard = new String[2][6];
        String[] parts1 = date1.split("-");
        int year1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int day1 = Integer.parseInt(parts1[2]);
        String[] parts2 = date2.split("-");
        int day2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int year2 = Integer.parseInt(parts2[2]);

        // Create month board
        monthBoard[0][0] = getMonthName(month1) + " " + year1;
        monthBoard[0][1] = getMonthName(month1 + 1) + " " + year1;
        monthBoard[0][2] = getMonthName(month1 + 2) + " " + year1;
        monthBoard[1][0] = day2 + "-" + getMonthName(month2) + "-" + year2;
        monthBoard[1][1] = day2 + "-" + getMonthName(month2 + 1) + "-" + year2;
        monthBoard[1][2] = day2 + "-" + getMonthName(month2 + 2) + "-" + year2;

        // Print month board
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(monthBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
}