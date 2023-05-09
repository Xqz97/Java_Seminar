package Lesson2;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
public class HomeWork2 {
    public static void main(String[] args) {
        //HW_2_1();
        HW_2_2("C://Java_lesson//untitled");
    }

    //    Задача 2.1
//    Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//    Если значение null, то параметр не должен попадать в запрос.
//            Пример 1:
//    Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
//    Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//
//    Пример 2:
//    Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
//    Результат: SELECT * FROM USER;

    private static StringBuilder HW_2_1() {
        String[] Students = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        System.out.println(Arrays.toString(Students));

        String[] name = Students[0].split(":");
        String[] country = Students[1].split(":");
        String[] city = Students[2].split(":");
        String[] age = Students[3].split(":");

        String skipElem = "null";
        StringBuilder selectWhere = new StringBuilder();

        if (!Objects.equals(name[1], skipElem)) {
            selectWhere.append(" ").append(Students[0]);
        }
        if (!Objects.equals(country[1], skipElem)) {
            selectWhere.append(" ").append(Students[1]);
        }
        if (!Objects.equals(city[1], skipElem)) {
            selectWhere.append(" ").append(Students[2]);
        }
        if (!Objects.equals(age[1], skipElem)) {
            selectWhere.append(" ").append(Students[3]);
        }
        System.out.println("SELECT * FROM USER " + selectWhere);
        return selectWhere;
    }


//
//    //   Задача 2.2
////    Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
////        1 Расширение файла: txt
////        2 Расширение файла: pdf
////        3 Расширение файла:
////        4 Расширение файла: jpg
    private static void HW_2_2(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            String name = files[i].getName();
            String typeFile = "";
            int j = name.lastIndexOf('.');
            if (j > 0) {
                typeFile = name.substring(j + 1);
            }
            System.out.println((i + 1) + " Расширение файла: " + typeFile);
        }
    }
}

