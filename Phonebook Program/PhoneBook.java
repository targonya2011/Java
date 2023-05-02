package practice;

import java.util.*;

public class PhoneBook {

    TreeMap<String, String> treeMap = new TreeMap<>();

    public void addContact(String phone, String name) {
        if (phone.matches("[\\d]{11}") && name.matches("[А-Яа-я]+")) {
            getContactByPhone(phone);
            getContactByName(name);
            if (treeMap.containsValue(name)) {
                getContactTwoNumbers(phone, name);
            } else {
            treeMap.put(phone, name);
            System.out.println("Контакт сохранен!");
        }
        }

        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }
    public Set<String> getAllContacts() {

        Set<String> phonebook = new TreeSet<>();
        for (String key : treeMap.keySet()) {
            phonebook.add(treeMap.get(key) + " - " + key);
        }
        return phonebook;
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
    }

    public String getContactByPhone(String phone) {
        if (treeMap.containsKey(phone)) {
            System.out.println(treeMap.get(phone) + " - " + phone);
            return treeMap.get(phone) + " - " + phone;
        } else {
            return "";
        }
    }

    public Set<String> getContactByName(String name) {

        Set<String> setPhoneBook = new TreeSet<>();
        String namePlusTel = "";

        if (treeMap.containsValue(name)) {
            namePlusTel = namePlusTel.concat(name) + " - ";
            for (String tel : treeMap.keySet()) {
                if (treeMap.get(tel).equals(name)) {
                    namePlusTel = namePlusTel.concat(tel) + ", ";
                }
            }
            setPhoneBook.add(namePlusTel.substring(0, namePlusTel.length() - 2));
            return setPhoneBook;
        } else {
            return new TreeSet<>();
        }
    }
    public Set<String> getContactTwoNumbers(String phone, String name) {
        TreeSet<String> result = new TreeSet<>();
        String key = "";
        String namePlusNumber = "";
        if (treeMap.containsValue(name)){
            for(String k : treeMap.keySet())
            {
                if (treeMap.get(k).equals(name)){
                    key = k;
                    result.add(name + " - " + key + ", " + phone);
                    namePlusNumber = key + ", " + phone;
                    break;
                }
            }
        }
        treeMap.remove(key);
        treeMap.put(namePlusNumber, name);
        return result;
    }

}
