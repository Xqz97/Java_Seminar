package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class Seminar5 {
    public static void main(String[] args) {
        // ex_5_1();
        System.out.println("MMCMXCIX -> " + ex_5_2("MMCMXCIX"));
    }

    private static Integer ex_5_2(String romanNum) {
        Map<Character, Integer> romanDecimalMap;
        romanDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        StringBuilder romanNumSb = new StringBuilder(romanNum.trim()).reverse();
        int decimalNum = 0;
        int prevNum = -1;
        for (Character romanChar: romanNumSb.toString().toCharArray()){
            int currentNum = romanDecimalMap.get(romanChar);
            if (currentNum < prevNum){
                currentNum *= -1;
            }
            decimalNum += currentNum;
            prevNum = currentNum;

        }
        return decimalNum;
    }

    private static void ex_5_1() {
        Map<String, String> emploeeMap = new HashMap<>(20);
        emploeeMap.put("4313", "Иванов");
        emploeeMap.put("1456", "Петров");
        emploeeMap.put("1868", "Сидоров");
//        for (Map.Entry<String, String> entry: emploeeMap.entrySet()) {
//            System.out.printf("%s\t->\t%s%n", entry.getKey(), entry.getValue());
//        }
//        for (String key : emploeeMap.keySet()) {
//            System.out.printf("%s\t->\t%s%n", key, emploeeMap.get(key));
//        }
    }
}
