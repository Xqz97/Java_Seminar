package Lesson4;

import java.util.*;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        ex_4_1();
        // ex_4_2();
    }

    private static void ex_4_1() {
        Scanner myScanner = new Scanner(System.in);
        LinkedList<String> initialList  = new LinkedList<>();

        while (true) {
            System.out.println("Введите строку или команду для форматирования списка строк (print/revert): ");
            String inputData = myScanner.nextLine();

            if (inputData.equals("print")) {
                System.out.println("Строки напечатаны в порядке обратном вводу: ");
                while (!initialList.isEmpty()) {
                    System.out.println(initialList.removeLast());
                }
            } else if (inputData.equals("revert")) {
                if (!initialList.isEmpty()) {
                    initialList.removeLast();
                    System.out.println("Последняя введенная строка удалена из списка.");
                } else {
                    System.out.println("Список пуст. Нет строк для удаления.");
                }
            } else {
                initialList.addLast(inputData);
            }
        }
    }

    public static LinkedList revLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
    private static void ex_4_2() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.addFirst("А");
        list.addLast("Б");
        list.add("В");
        // [A, 1, 2, 3, Б, В]
        LinkedList<String> reversedList = revLinkedList(list);
        System.out.println(reversedList);
        // [В, Б, 3, 2, 1, А]
    }
}

