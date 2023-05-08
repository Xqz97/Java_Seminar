package Lesson2;

import java.util.Scanner;
public class Seminar2 {
    public static void main(String[] args) {
           // ex_2_1();
            ex_2_2();
    }

//    Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    private static void ex_2_1() {
        char c1 = 'A';
        char c2 = 'b';
        String result = "";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите число символов в массиве: ");
        int amountOfChar  = myScanner.nextInt();
        char temp = c2;
        for (int i = 0; i < amountOfChar; i++) {
            if (temp == c1){
                result += c2;
                temp = c2;
            }
            else{
                result += c1;
                temp = c1;
            }

        }
        System.out.println(result);
    }
//    Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd

    private static void ex_2_2() {
        String longString = "aaaabbbcdd";
        StringBuilder shortStringSB = new StringBuilder();
        char prev = longString.charAt(0);
        char curr = prev;
        int counter = 1;

        for (int i = 1; i < longString.length(); i++) {
            prev = longString.charAt(i - 1);
            curr = longString.charAt(i);
            if (prev != curr) {
                shortStringSB.append(prev);
                shortStringSB.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        shortStringSB.append(curr);
        shortStringSB.append((counter > 1) ? counter : "");

        System.out.printf("%s -> %s%n", longString, shortStringSB);
    }
}

