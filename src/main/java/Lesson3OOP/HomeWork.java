package Lesson3OOP;

import java.util.Iterator;

public class HomeWork {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add("data_1");
        list.add("data_2");

        list.add(1, "data2_1");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.println(element);
        }
    }
}
