package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static PhoneBook treeMap = new PhoneBook();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер, имя или команду: ");
            String name2number = scanner.nextLine();
            boolean thisIsNumber = Pattern.matches(("\\d{11}"), name2number.trim());
            boolean thisIsCommand = Pattern.matches("[A-Z]+", name2number.trim());
            boolean thisIsName = Pattern.matches("[А-Яа-я]+", name2number.trim());
            if (thisIsName) {
                System.out.println("Введите номер телефона для контакта " + "\"" + name2number + "\"");
                String phoneNumber = scanner.nextLine();
                treeMap.addContact(phoneNumber, name2number);
            } else
            if (thisIsNumber) {
                System.out.println("Введите имя контакта для номера " + "\"" + name2number + "\"");
                String contact = scanner.nextLine();
                treeMap.addContact(name2number, contact);
            } else
                if (thisIsCommand && name2number.equals("LIST")) {
                treeMap.getAllContacts();
            } else {
                    System.out.println("Неверный формат ввода");
                }



        }
    }
}
