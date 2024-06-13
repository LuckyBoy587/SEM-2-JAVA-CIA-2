import java.io.*;
import java.time.*;

import java.time.temporal.IsoFields;

class Q13 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String date = "2020-12-12";
        parseDate(date);
    }

    public static void parseDate(String date) throws IOException, ClassNotFoundException {
        LocalDate localDate = LocalDate.parse(date);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int weekOfYear = localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        Month month = localDate.getMonth();
        int year = localDate.getYear();

        String day = dayOfWeek.toString();
        String week = "Week" + weekOfYear;
        String monthName = month.toString();
        String yearString = String.valueOf(year);

        System.out.println(day + ", " + week + ", " + monthName + " " + yearString);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("date.ser"))) {
            outputStream.writeObject(new DateObject(day, week, monthName, yearString));
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("date.ser"))) {
            DateObject dateObject = (DateObject) inputStream.readObject();
            System.out.println("Deserialized date: " + dateObject.getDay() + ", " + dateObject.getWeek() + ", " + dateObject.getMonth() + " " + dateObject.getYear());
        }
    }
}

class DateObject implements Serializable {
    private final String day;
    private final String week;
    private final String month;
    private final String year;

    public DateObject(String day, String week, String month, String year) {
        this.day = day;
        this.week = week;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public String getWeek() {
        return week;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}