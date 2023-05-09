package Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Seminar2 {
    public static void main(String[] args) {
           // ex_2_1();
           // ex_2_2();
           // ex_2_3("234234");
        try {
            ex_2_5("C:/Java_lesson/untitled");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
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
//    Напишите метод, который принимает на вход строку (String) и
//    определяет является ли строка палиндромом (возвращает boolean значение).

    private static boolean ex_2_3(String inputStr) {
        inputStr = inputStr.toLowerCase()
                .replace(" ", "")
                .replace("-", "");
        for (int i = 0; i < inputStr.length() / 2; i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    //    Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//    Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//    Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

    private static void ex_2_5(String pathDir) throws FileNotFoundException {
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())){
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String fileName : file.list()){
            sb.append(fileName).append(System.lineSeparator());
        }
        System.out.println(sb);

        try(PrintWriter pw = new PrintWriter("src/main/resources/files/filesNames.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}

