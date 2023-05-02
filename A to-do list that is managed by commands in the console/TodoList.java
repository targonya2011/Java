package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();
    public void add(String todo) {
        todoList.add(todo);
    }
    public void add(int index, String todo) {
        if (index >= 0 && index <= todoList.size()) {
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }
    }
    public ArrayList<String> getTodos() {
        int ind = 0;
        for (String todo : todoList) {
            System.out.println(ind +" - "+ todo);
            ind++;
    }
        return new ArrayList<> (todoList);
    }
    public void edit(int index, String todo) {
        if (index >= 0 && index <= todoList.size()) {
            todoList.set(index, todo);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index <= todoList.size() - 1) {
            todoList.remove(index);
        }
    }


}