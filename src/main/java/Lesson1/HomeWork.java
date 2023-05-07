package Lesson1;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class HomeWork {
    public static void main(String[] args) {
        // hw_1_1();
        // hw_1_2();
        // hw_1_3();
        hw_1_4();
    }


    //  Задача 1.1
//  Написать метод, принимающий на вход два аргумента: len и initialValue,
//  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    private static void hw_1_1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int len = myScanner.nextInt();
        Scanner myScanner1 = new Scanner(System.in);
        System.out.println("Введите число для заполнения массива: ");
        int initialValue = myScanner1.nextInt();
        int[] myArray = new int[len];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = initialValue;
        }
        System.out.println(Arrays.toString(myArray));
    }

    //    Задача 1.2
//    Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    private static void hw_1_2() {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(1, 6);
        }
        System.out.println(Arrays.toString(array));
        int max_value = array[0];
        int min_value = array[0];
        for (int i = 1; i < array.length; i++){
            if (min_value > array[i]){
                min_value = array[i];
            }
            if (max_value < array[i]){
                max_value = array[i];
            }
        }
        System.out.printf("min = %d, max = %d\n", min_value, max_value);
    }

    //    Задача 1.3
//    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//    (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей
//    можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void hw_1_3() {
        Random random = new Random();
        int len = random.nextInt(3) + 7;
        int[][] array = new int[len][len];
        int d = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][d--] = 1;
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d  ", array[i][j]);
            }
            System.out.println();
        }
    }
    //   Задача 1.4
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    private static void hw_1_4() {
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();
        myScanner.close();
        int n = 0;
        int time = LocalDateTime.now().getHour();
        if (time >= 12 && time <= 16) {
            n = 1;
        } else if (time >= 17 && time <= 23) {
            n = 2;
        } else if (time >= 0 && time <= 3) {
            n = 3;
        }
        String[] welcome = new String[]{"Доброе утро, %s!", "Добрый день, %s!", "Добрый вечер, %s!", "Доброй ночи, %s!"};
        System.out.printf(welcome[n], name);
    }

}