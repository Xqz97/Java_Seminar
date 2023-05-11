package Lesson3;

import java.util.*;

public class Seminar3 {
    public static void main(String[] args) {
        // ex_3_1();
        // ex_3_2();
        ex_3_3();
    }


    //    Задача 3.1
//    Заполнить список десятью случайными числами.
//    Отсортировать список методом sort() и вывести его на экран.

    private static void ex_3_1() {
        Random random = new Random();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
//    Задача 3.2
//    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//    Вывести название каждой планеты и количество его повторений в списке.

    private static void ex_3_2() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        randomSolarSystem.sort(Comparator.naturalOrder());
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planetsNamesStringArray.length; i++) {
            count = 0;
            for (var item :
                    randomSolarSystem) {
// for (int j = 0; j < randomSolarSystem.size(); j++) {
                if (item.equals(planetsNamesStringArray[i]))
                    count++;
            }
            sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");
        }
        System.out.println(sb);
    }
//    Задача 3.3
//    Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
    private static void ex_3_3() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);
        Set<String> set1 = new HashSet<>(randomSolarSystem);
        randomSolarSystem.clear();
        randomSolarSystem.addAll(set1);
        System.out.println(randomSolarSystem);
    }
}