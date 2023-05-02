package practice;


import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    private static TodoList todoList = new TodoList();
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String commandStr = scanner.nextLine();

            String[] wordsOfCommandStr = commandStr.split(" ");
            String command = wordsOfCommandStr[0].trim();
            boolean thisIsCommand = Pattern.matches(("^[A-Z]+"), wordsOfCommandStr[0].trim());
            int index = 0;
            String addDeal = "";
            String changeDeal = "";
            String deletedDeal = "";
            if (thisIsCommand) {
                    switch (command) {
                        case "ADD" :
                            boolean thisIsIndex = Pattern.matches(("^[0-9]+"), wordsOfCommandStr[1].trim());
                            if (thisIsIndex) {
                                index = Integer.parseInt(wordsOfCommandStr[1]);

                                if (index > -1) {
                                    for(int i = 2; i < wordsOfCommandStr.length; i++) {
                                        addDeal = addDeal + wordsOfCommandStr[i];
                                    }
                                    todoList.edit(index, addDeal);
                                    System.out.println("На позицию " + index + " добавлено дело " + "\"" + addDeal.trim() + "\"");
                                }
                            } else {
                                for(int i = 1; i < wordsOfCommandStr.length; i++) {
                                    addDeal = addDeal + " " + wordsOfCommandStr[i];
                                }
                                todoList.add(addDeal.trim());
                                System.out.println("Добавлено дело " + "\"" + addDeal.trim() + "\"");
                            }
                            break;
                        case "LIST" :
                            todoList.getTodos();
                            break;
                        case "EDIT" :
                            index = Integer.parseInt(wordsOfCommandStr[1]);
                            changeDeal = todoList.getTodos().get(index);
                        for(int i = 2; i < wordsOfCommandStr.length; i++) {
                                addDeal = addDeal + " " + wordsOfCommandStr[i];
                            }
                            todoList.edit(index, addDeal);
                            System.out.println("дело " + "\"" + changeDeal.trim() + "\"" + " заменено на дело " + "\"" + addDeal.trim() + "\"");
                            break;
                        case "DELETE" :
                            index = Integer.parseInt(wordsOfCommandStr[1]);
                                deletedDeal = todoList.getTodos().get(index);
                                todoList.delete(index);
                                System.out.println("удалено дело " + "\"" + deletedDeal + "\"");
                        break;


                        default:   System.out.println("Вы ввели неверную команду");
                    }
                }






        }









    }
}
