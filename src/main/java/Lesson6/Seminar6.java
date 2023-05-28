package Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;


public class Seminar6 {
    public static void main(String[] args) {
//        ex_6_1();
        int[] arr = ex_6_2();
        System.out.println(getPresentUniqElement(arr));
    }

//1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
    private static void ex_6_1() {
       // HashSet intSet = new HashSet(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3);
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(2);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(3);
        intSet.add(0);
        System.out.println(intSet);
        TreeSet intTset = new TreeSet(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        intTset.add(0);
        System.out.println(intTset);
    }

//    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//            2. Создайте метод, в который передайте заполненный выше
//    массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//    Для вычисления процента используйте формулу:
//    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

    private static int[] ex_6_2() {

        int[] array = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(0,25);
        }
        return array;
    }
    public static Double getPresentUniqElement(int[] array){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num: array){
            hashSet.add(num);
        }
        int setLen = hashSet.size();
        Double res = setLen * 100.0 / array.length;
        return res;
    }
}
