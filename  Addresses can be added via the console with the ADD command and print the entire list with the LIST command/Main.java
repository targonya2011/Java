package practice;
import java.util.Scanner;


public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */
    private static EmailList treeSet = new EmailList();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            if (input.indexOf(" ") != -1) {
                String [] words = input.split(" ");
                if (words[0].equals("ADD")) {
                    treeSet.add(words[1]);
                } else {
                    System.out.println(WRONG_EMAIL_ANSWER);
                }
            }
            if (input.equals("LIST")) {
                treeSet.getSortedEmails();
            }
        }
    }
}
