import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        int randomNumber = scanner.nextInt();

        String day = getDay(dayNumber);
        System.out.println(day);

        int currentDayNumber = (dayNumber + randomNumber - 1) % 7 + 1;
        System.out.println(currentDayNumber);
    }

    public static String getDay(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            case 7 -> "SUNDAY";
            default -> "Invalid day number";
        };
    }
}