package Lesson2;

import java.io.File;
public class HomeWork2 {
    public static void main(String[] args) {
        // HW_2_1();
        HW_2_2();
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

    private static void HW_2_1() {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":null}";
        JSONObject obj = new JSONObject(json);
        StringBuilder where = new StringBuilder("SELECT * FROM USER WHERE: ");
        boolean first = true;
        for (String key : obj.keySet()) {
            if (obj.isNull(key)) {
                continue;
            }
            if (!first) {
                where.append(" and ");
            }
            where.append(key).append(" = '").append(obj.getString(key)).append("'");
            first = false;
        }
        System.out.println(where.toString());
    }

    //   Задача 2.2
//    Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg
    private static void HW_2_2() {
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

