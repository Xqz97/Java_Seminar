package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        // HW_3_1();
        HW_3_2();
    }

    //    HomeTask 3.1
//    Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.
//    Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}

    private static void HW_3_1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("234");
        list.add("Груша");
        list.add("Дыня");
        list.add("Арбуз");
        list.add("167");
        System.out.println("Первоначальный список: " + list);
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            try {
                Integer.parseInt(element);
                list.remove(i);
                i--;
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println("Список после удаления целых чисел: " + list);
    }

    //    HomeTask 3.2
//    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//    что на 0й позиции каждого внутреннего списка содержится название жанра,
//    а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры(можно через консоль).
    private static void HW_3_2() {
        Scanner myScanner = new Scanner(System.in);
        List<ArrayList<String>> catalog = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите Жанр книги: ");
            String inputClassOfBook = myScanner.nextLine();
            ArrayList<String> bookList = new ArrayList<>();
            bookList.add(inputClassOfBook);
            System.out.print("Введите количество книг в жанре: ");

            int numOfBook = Integer.parseInt(myScanner.nextLine());
            for (int j = 0; j < numOfBook; j++) {
                System.out.print("Введите название книги: ");
                String inputBookName = myScanner.nextLine();
                bookList.add(inputBookName);
            }
            catalog.add(bookList);
        }
        System.out.println(catalog);
    }
}




