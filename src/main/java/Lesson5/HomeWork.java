package Lesson5;

import java.util.*;
public class HomeWork {
    public static void main(String[] args) {
          Map<String, ArrayList<String>> phonebook1 = hw_5_1();
//        for (var entry : phonebook.entrySet()) {
//            System.out.println(entry);
//        }
          hw_5_2(phonebook1);
    }

    //1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//    Пусть дан список сотрудников:
//    Иван Иванов
//    Светлана Петрова
//    Кристина Белова
//    Анна Мусина
//    Анна Крутова
//    Иван Юрин
//    Петр Лыков
//    Павел Чернов
//    Петр Чернышов
//    Мария Федорова
//    Марина Светлова
//    Мария Савина
//    Мария Рыкова
//    Марина Лугова
//    Анна Владимирова
//    Иван Мечников
//    Петр Петин
//    Иван Ежов

    private static Map<String, ArrayList<String>> hw_5_1() {
        Map<String, ArrayList<String>> phonebook = Map.ofEntries(
                Map.entry("Иван Иванов", new ArrayList<>(Arrays.asList("+7 981 4313", "+7 981 5959", "+7 981 2345", "+7 981 5453"))),
                Map.entry("Светлана Петрова", new ArrayList<>(List.of("+7 981 4321"))),
                Map.entry("Кристина Белова", new ArrayList<>(List.of("+7 981 8775"))),
                Map.entry("Анна Мусина", new ArrayList<>(List.of("+7 981 3333"))),
                Map.entry("Анна Крутова", new ArrayList<>(List.of("+7 981 4456"))),
                Map.entry("Иван Юрин", new ArrayList<>(List.of("+7 981 9807"))),
                Map.entry("Петр Лыков", new ArrayList<>(List.of("+7 981 1212"))),
                Map.entry("Павел Чернов", new ArrayList<>(List.of("+7 981 6665"))),
                Map.entry("Петр Чернышов", new ArrayList<>(List.of("+7 981 9753"))),
                Map.entry("Мария Федорова", new ArrayList<>(Arrays.asList("+7 981 1357", "+7 981 8453"))),
                Map.entry("Марина Светлова", new ArrayList<>(List.of("+7 981 2468"))),
                Map.entry("Мария Савина", new ArrayList<>(List.of("+7 981 3579"))),
                Map.entry("Мария Рыкова", new ArrayList<>(List.of("+7 981 4680"))),
                Map.entry("Марина Лугова", new ArrayList<>(Arrays.asList("+7 981 1133", "+7 981 2345"))),
                Map.entry("Анна Владимирова", new ArrayList<>(List.of("+7 981 6754"))),
                Map.entry("Иван Мечников", new ArrayList<>(List.of("+7 981 1277"))),
                Map.entry("Петр Петин", new ArrayList<>(Arrays.asList("+7 981 8702", "+7 981 4532"))),
                Map.entry("Иван Ежов", new ArrayList<>(List.of("+7 981 4538")))
        );
        return phonebook;
    }
//    2. Написать программу, которая найдёт и выведет повторяющиеся имена
//    с количеством повторений. Отсортировать по убыванию популярности.
    private static void hw_5_2(Map<String, ArrayList<String>> phonebook) {
        Map<String, Integer> overlapping = new HashMap<>();
        for (var entry1 : phonebook.keySet()) {
            String entry2 = entry1.split(" ")[0];
            if (overlapping.containsKey(entry2)) {
                overlapping.put(entry2, overlapping.get(entry2) + 1);
            } else {
                overlapping.put(entry2, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(overlapping.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        System.out.println(list);
    }
}
