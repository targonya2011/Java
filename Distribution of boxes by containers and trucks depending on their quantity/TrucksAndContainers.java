package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
        int isContainerFull = 27;
        int isTruckFull = 12;
        int truck = 0;
        int container = 0;

            if (boxes > 0){
                for (int i = 1; i <= boxes; i++) {
                    if (i % ((isContainerFull) * isTruckFull) == 1) {
                        truck++;
                        container++;
                        System.out.println("Грузовик: " + truck + "\n\t" + "Контейнер: " + container);
                    } else {
                        if (i % isContainerFull == 1) {
                            container++;
                            System.out.println("\t" + "Контейнер: " + container);
                        }
                    }
                    System.out.println("\t\t" + "Ящик: " + i);
                }
                System.out.println("Необходимо:" + "\n" +
                                    "грузовиков - " + truck + " шт." + "\n" +
                                    "контейнеров - " + container + " шт.");
            } else {
                System.out.println("Необходимо:" + "\n" +
                        "грузовиков - 0 шт." + "\n" +
                        "контейнеров - 0 шт.");
            }









        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
