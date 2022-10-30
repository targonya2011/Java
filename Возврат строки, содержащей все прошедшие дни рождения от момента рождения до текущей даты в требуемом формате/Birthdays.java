package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {


    public static void main(String[] args) {

        int day = 17;
        int month = 4;
        int year = 1996;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").localizedBy(new Locale("us"));
        String allDay = "";
        int countYears = 0;

        while (today.isAfter(birthday.plusYears(countYears)) || today.isEqual(birthday.plusYears(countYears))) {
            allDay = allDay + countYears + " - " + formatter.format(birthday.plusYears(countYears)) + "\n";
            countYears++;
        }
        return allDay;
    }
}
//TODO реализуйте метод для построения строки в следующем виде
//0 - 31.12.1990 - Mon
//1 - 31.12.1991 - Tue