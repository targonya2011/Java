package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }
      String regex = "[^0-9]";
      String result = input.replaceAll(regex, "");
      if (result.length() == 10) {
        System.out.println("7" + result);
        break;
      } else if (result.length() == 11 && result.charAt(0) == '7') {
        System.out.println(result);
        break;
      } else if (result.length() == 11 && result.charAt(0) == '8') {
        System.out.println("7" + result.substring(1,11));
        break;
      } else {
        System.out.println("Неверный формат номера");
        break;
      }



    }
  }

}
