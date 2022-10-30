package practice;

import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        var number = "М999АА100";
        List list = CoolNumbers.generateCoolNumbers();
        System.out.println("Количество номеров: " + list.size());

        long time1 = System.nanoTime();
        String search = CoolNumbers.bruteForceSearchInList(list, number) ? "нашел" : "не нашел";
        long time2 = System.nanoTime();
        String time = Long.toString(time2 - time1);
        System.out.println("Поиск перебором: " + time + " нс. " + search);


        List sortedList = new ArrayList(list);
        Collections.sort(sortedList);
        time1 = System.nanoTime();
        search = CoolNumbers.binarySearchInList(sortedList, number) ? "нашел" : "не нашел";
        time2 = System.nanoTime();
        time = Long.toString(time2 - time1);
        System.out.println("Бинарный поиск: " + time + " нс. " + search);


        HashSet<String> hashSet = new HashSet<>(list);
        time1 = System.nanoTime();
        search = CoolNumbers.searchInHashSet(hashSet, number) ? "нашел" : "не нашел";
        time2 = System.nanoTime();
        time = Long.toString(time2 - time1);
        System.out.println("Поиск по Hash: " + time + " нс. " + search);

        TreeSet<String> treeSet = new TreeSet<>(list);
        time1 = System.nanoTime();
        search = CoolNumbers.searchInTreeSet(treeSet, number) ? "нашел" : "не нашел";
        time2 = System.nanoTime();
        time = Long.toString(time2 - time1);
        System.out.println("Поиск в TreeSet: " + time + " нс. " + search);

    }





}
